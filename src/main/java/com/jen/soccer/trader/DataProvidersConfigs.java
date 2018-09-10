package com.jen.soccer.trader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class DataProvidersConfigs {

    @Value("${data.service.protocol}")
    private String protocol;

    @Value("${data.service.host}")
    private String host;


    @Value("${data.service.path.version1}")
    private String version1;

    @Value("${data.service.path.version2}")
    private String version2;

    @Value("${data.service.path.teams}")
    private String teamsEndPoint;

    @Value("${data.service.path.teams.parameters.name}")
    private String teamsEndPointNameParam;

    @Value("${data.service.path.teams.parameters.matches}")
    private String teamsEndPointNameMatches;

    @Value("${data.service.auth.header.key}")
    private String authHeaderKey;

    @Value("${data.service.auth.header.value}")
    private String authHeaderValue;

    public String getAuthHeaderKey() {
        return authHeaderKey;
    }

    public void setAuthHeaderKey(String authHeaderKey) {
        this.authHeaderKey = authHeaderKey;
    }

    public String getAuthHeaderValue() {
        return authHeaderValue;
    }

    public void setAuthHeaderValue(String authHeaderValue) {
        this.authHeaderValue = authHeaderValue;
    }

    public String getTeamsEndPointNameMatches() {
        return teamsEndPointNameMatches;
    }

    public void setTeamsEndPointNameMatches(String teamsEndPointNameMatches) {
        this.teamsEndPointNameMatches = teamsEndPointNameMatches;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getVersion1() {
        return version1;
    }

    public void setVersion1(String version1) {
        this.version1 = version1;
    }

    public String getVersion2() {
        return version2;
    }

    public void setVersion2(String version2) {
        this.version2 = version2;
    }

    public String getTeamsEndPoint() {
        return teamsEndPoint;
    }

    public void setTeamsEndPoint(String teamsEndPoint) {
        this.teamsEndPoint = teamsEndPoint;
    }

    public String getTeamsEndPointNameParam() {
        return teamsEndPointNameParam;
    }

    public void setTeamsEndPointNameParam(String teamsEndPointNameParam) {
        this.teamsEndPointNameParam = teamsEndPointNameParam;
    }
}

