package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder({ "name", "class", "model" })
public class StarShipInfo implements Serializable {
    private String name;
    private String starship_class;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("class")
    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public StarShipInfo(String name, String starship_class, String model){
        this.name = name;
        this.starship_class = starship_class;
        this.model = model;
    }

}
