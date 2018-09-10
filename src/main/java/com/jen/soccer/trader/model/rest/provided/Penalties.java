package com.jen.soccer.trader.model.rest.provided;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class Penalties {
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }
}