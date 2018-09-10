package com.jen.soccer.trader.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlServiceTest {

    public static final String TES_TEAM = "manchester";
    public static final String TEST_URL_TEAMS = "http://api.football-data.org/v1/teams?name=manchester";
    public static final String TEST_URL_MATCHES = "http://api.football-data.org/v2/teams/86/matches";
    public static final int TEST_TEAM_ID = 86;
    @Autowired
    UrlService urlService;

    @Test
    public void testTheTemasByNameUrlConstruction() {
        Assert.assertEquals(TEST_URL_TEAMS,urlService.getFindTeamsByNameUrl(TES_TEAM));
    }

    @Test
    public void testTheMatchesByTeamIdUrlConstruction() {
        Assert.assertEquals(TEST_URL_MATCHES,urlService.getTeamMatchesById(TEST_TEAM_ID));
    }
}
