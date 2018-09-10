package com.jen.soccer.trader.model.rest.provided;

import java.util.List;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */

public class TeamsResponse {
    private Links Links;
    private String searchQuery;
    private int count;
    private List<TeamsItem> teams;

    public com.jen.soccer.trader.model.rest.provided.Links getLinks() {
        return Links;
    }

    public void setLinks(com.jen.soccer.trader.model.rest.provided.Links links) {
        Links = links;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<TeamsItem> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamsItem> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "TeamsResponse{" +
                "Links=" + Links +
                ", searchQuery='" + searchQuery + '\'' +
                ", count=" + count +
                ", teams=" + teams +
                '}';
    }
}