package com.jen.soccer.trader.service;

import com.jen.soccer.trader.DataProvidersConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UrlService {
    @Autowired
    private DataProvidersConfigs applicationConfigs;

    public String getFindTeamsByNameUrl(String name){
       return getVersion1Uri()
                .path(applicationConfigs.getTeamsEndPoint())
                .queryParam(applicationConfigs.getTeamsEndPointNameParam(),name)
                .build()
                .encode()
                .toUriString();
    }

    public String getTeamMatchesById(int id){
        return getVersion2Uri()
                .path(applicationConfigs.getTeamsEndPoint())
                .path("/"+id)
                .path(applicationConfigs.getTeamsEndPointNameMatches())
                .build()
                .encode()
                .toUriString();
    }

    private UriComponentsBuilder getVersion1Uri() {
        return getBaseUri()
                .path(applicationConfigs.getVersion1());
    }

    private UriComponentsBuilder getVersion2Uri() {
        return getBaseUri()
                .path(applicationConfigs.getVersion2());
    }

    private UriComponentsBuilder getBaseUri() {
        return UriComponentsBuilder.newInstance()
                .scheme(applicationConfigs.getProtocol())
                .host(applicationConfigs.getHost());
    }

    public RestTemplate getRestTemplateForV1() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }


}
