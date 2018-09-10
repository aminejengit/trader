package com.jen.soccer.trader.model.rest.provided;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class TeamsItem {
    private int id;
    private String name;
    private int currentCompetition;
    private String currentLeague;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentCompetition() {
        return currentCompetition;
    }

    public void setCurrentCompetition(int currentCompetition) {
        this.currentCompetition = currentCompetition;
    }

    public String getCurrentLeague() {
        return currentLeague;
    }

    public void setCurrentLeague(String currentLeague) {
        this.currentLeague = currentLeague;
    }

    @Override
    public String toString() {
        return "TeamsItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currentCompetition=" + currentCompetition +
                ", currentLeague='" + currentLeague + '\'' +
                '}';
    }
}