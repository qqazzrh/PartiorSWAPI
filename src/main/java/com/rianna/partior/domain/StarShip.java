package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarShip {
    private String name;

    private String model;

    private String starship_class;

    private String url;

    private String crew;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "StarShip: "+ this.crew+", "+this.name;
    }

    public StarShipInfo castToStarShipInfo() {
        return new StarShipInfo(name, starship_class,model);
    }

}
