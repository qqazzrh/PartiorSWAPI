package com.rianna.partior.domain;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "starShip", "crew", "isLeiaOnPlanet" })
public class Information {
    private final StarShip starShip;
    private final Integer crew;
    private final Boolean isLeiaOnPlanet;

    private Information(InformationBuilder builder){
        this.starShip = builder.starShip;
        this.crew = builder.crew;
        this.isLeiaOnPlanet = builder.isLeiaOnPlanet;
    }

    @JsonGetter("starship")
    public StarShip getStarShip() {
        return starShip;
    }

    public Integer getCrew() {
        return crew;
    }

    @JsonGetter("isLeiaOnPlanet")
    public Boolean getIsLeiaOnPlanet() {
        return isLeiaOnPlanet;
    }

    @Override
    public String toString() {
        return "Information: the starship in use: " + this.starShip.toString() + " the number of crews on board: " + this.crew + " if Princess Leia is in: " + isLeiaOnPlanet;
    }

    public static class InformationBuilder{
        private StarShip starShip;
        private Integer crew;
        private Boolean isLeiaOnPlanet;

        public InformationBuilder(){}

        public InformationBuilder starShip(StarShip starShip){
            this.starShip = starShip;
            return this;
        }

        public InformationBuilder crew(Integer crew){
            this.crew = crew;
            return this;
        }

        public InformationBuilder isLeiaOnPlanet(Boolean isLeiaOnPlanet){
            this.isLeiaOnPlanet = isLeiaOnPlanet;
            return this;
        }

        public Information build(){
            Information information = new Information(this);
            return information;
        }
    }



}
