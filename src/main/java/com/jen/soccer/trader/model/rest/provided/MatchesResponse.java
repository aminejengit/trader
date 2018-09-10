package com.jen.soccer.trader.model.rest.provided;

import java.util.List;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class MatchesResponse {
    private int count;
    private Filters filters;
    private List<MatchesItem> matches;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public List<MatchesItem> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchesItem> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "MatchesResponse{" +
                "count=" + count +
                ", filters=" + filters +
                ", matches=" + matches +
                '}';
    }
}