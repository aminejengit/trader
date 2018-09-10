package com.jen.soccer.trader.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamsServiceTest {
    public static final String TEST_TEAM_NAME = "real";
    public static final int TEST_TEAM_ID = 86;
    @Autowired
    TeamsService teamsService;

    @Test
    public void testFindTeamsByName() {
        teamsService.findTeamsByName(TEST_TEAM_NAME).stream().forEach(System.out::println);
    }

    @Test
    public void testGetTeamMatchesById() {
        teamsService.findMatchesOfTeamById(TEST_TEAM_ID).stream().forEach(System.out::println);
    }

}
