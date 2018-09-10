package com.jen.soccer.trader.model.rest.provided;

/**
 * Author: amine
 * Created by: ModelGenerator on 10/09/18
 */
public class RefereesItem {
    private int id;
    private String name;
    private Nationality nationality;

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

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}