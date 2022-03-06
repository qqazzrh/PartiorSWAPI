package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {
    private String name;
    private List<String> residents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getResidents() {
        return residents;
    }

    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "Planet: for  "+this.name +". It has "+ this.residents.size()+" residents.";
    }

}
