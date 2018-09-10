package com.jen.soccer.trader.model.domain;

import com.jen.soccer.trader.model.rest.provided.MatchesItem;

import java.beans.Transient;

public class Match {

    private MatchesItem matchesItem;
    private String team;
    private String opponent;
    private int teamGoals;
    private int opponentGoals;

    public Match(MatchesItem matchesItem, int id) {
        this.matchesItem = matchesItem;
        if (matchesItem.getHomeTeam().getId() == id) {
            teamGoals = matchesItem.getScore().getFullTime().getHomeTeam();
            opponentGoals = matchesItem.getScore().getFullTime().getAwayTeam();
            team = matchesItem.getHomeTeam().getName();
            opponent = matchesItem.getAwayTeam().getName();
        } else {
            teamGoals = matchesItem.getScore().getFullTime().getAwayTeam();
            opponentGoals = matchesItem.getScore().getFullTime().getHomeTeam();
            team = matchesItem.getAwayTeam().getName();
            opponent = matchesItem.getHomeTeam().getName();
        }

    }

    public int getAllGoals() {
        return this.opponentGoals + this.teamGoals;
    }

    public void setMatchesItem(MatchesItem matchesItem) {
        this.matchesItem = matchesItem;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public int getTeamGoals() {
        return teamGoals;
    }

    public void setTeamGoals(int teamGoals) {
        this.teamGoals = teamGoals;
    }

    public int getOpponentGoals() {
        return opponentGoals;
    }

    public void setOpponentGoals(int opponentGoals) {
        this.opponentGoals = opponentGoals;
    }

    @Override
    public String toString() {
        return "Match{" +
                "team='" + team + '\'' +
                ", opponent='" + opponent + '\'' +
                ", teamGoals=" + teamGoals +
                ", opponentGoals=" + opponentGoals +
                '}';
    }
}
