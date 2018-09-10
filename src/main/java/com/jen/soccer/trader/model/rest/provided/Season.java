package com.jen.soccer.trader.model.rest.provided;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class Season {
    private int id;
    private String startDate;
    private String endDate;
    private int currentMatchday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(int currentMatchday) {
        this.currentMatchday = currentMatchday;
    }
}