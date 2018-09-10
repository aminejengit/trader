package com.jen.soccer.trader.service;

import com.jen.soccer.trader.DataProvidersConfigs;
import com.jen.soccer.trader.model.domain.Match;
import com.jen.soccer.trader.model.rest.provided.MatchesItem;
import com.jen.soccer.trader.model.rest.provided.MatchesResponse;
import com.jen.soccer.trader.model.rest.provided.TeamsItem;
import com.jen.soccer.trader.model.rest.provided.TeamsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamsService {
    public static final String FINISHED = "FINISHED";
    @Autowired
    private DataProvidersConfigs applicationConfigs;

    @Autowired
    private UrlService urlService;

    public List<TeamsItem> findTeamsByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        TeamsResponse response = restTemplate.getForObject(urlService.getFindTeamsByNameUrl(name), TeamsResponse.class);
        if (response != null) {
            return response.getTeams();
        }
        return null;
    }

    public List<Match> findMatchesOfTeamById(int id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = getStringHttpEntity();
        ResponseEntity<MatchesResponse> response = restTemplate.exchange(urlService.getTeamMatchesById(id), HttpMethod.GET, entity, MatchesResponse.class);
        return response.getBody().getMatches().stream()
                .filter(matchesItem -> matchesItem.getStatus().equals(FINISHED))
                .map(matchesItem -> {
                    return new Match(matchesItem, id);
                }).collect(Collectors.toList());
    }

    private HttpEntity<String> getStringHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(applicationConfigs.getAuthHeaderKey(), applicationConfigs.getAuthHeaderValue());
        return new HttpEntity<String>(headers);
    }


}
