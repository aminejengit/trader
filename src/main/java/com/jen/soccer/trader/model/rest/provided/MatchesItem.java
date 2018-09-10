package com.jen.soccer.trader.model.rest.provided;

import java.util.List;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class MatchesItem {
    private int id;
    private Competition competition;
    private Season season;
    private String utcDate;
    private String status;
    private int matchday;
    private String stage;
    private String group;
    private String lastUpdated;
    private HomeTeam homeTeam;
    private AwayTeam awayTeam;
    private Score score;
    private List<RefereesItem> referees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(String utcDate) {
        this.utcDate = utcDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

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

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public List<RefereesItem> getReferees() {
        return referees;
    }

    public void setReferees(List<RefereesItem> referees) {
        this.referees = referees;
    }

    @Override
    public String toString() {
        return "MatchesItem{" +
                "id=" + id +
                ", competition=" + competition +
                ", season=" + season +
                ", utcDate='" + utcDate + '\'' +
                ", status='" + status + '\'' +
                ", matchday=" + matchday +
                ", stage='" + stage + '\'' +
                ", group='" + group + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", score=" + score +
                ", referees=" + referees +
                '}';
    }
}