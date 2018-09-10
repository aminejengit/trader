package com.jen.soccer.trader.model.domain;

import com.jen.soccer.trader.model.rest.provided.MatchesItem;

import java.util.List;

public class Analytics {
    private List<Match> matches;
    private double goalsAverage;
    private double selfGoalsAverage;

    public Analytics(List<Match> matches) {
        this.matches=matches;
        this.goalsAverage= matches.stream().mapToDouble(Match::getAllGoals).average().getAsDouble();
        this.selfGoalsAverage=matches.stream().mapToDouble(Match::getTeamGoals).average().getAsDouble();
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public double getGoalsAverage() {
        return goalsAverage;
    }

    public void setGoalsAverage(double goalsAverage) {
        this.goalsAverage = goalsAverage;
    }

    public double getSelfGoalsAverage() {
        return selfGoalsAverage;
    }

    public void setSelfGoalsAverage(double selfGoalsAverage) {
        this.selfGoalsAverage = selfGoalsAverage;
    }
}
