package com.rianna.partior.domain;


public class Information {
    private final StarShipInfo starship;
    private final Integer crew;
    private final Boolean isLeiaOnPlanet;

    private Information(InformationBuilder builder){
        this.starship = builder.starship;
        this.crew = builder.crew;
        this.isLeiaOnPlanet = builder.isLeiaOnPlanet;
    }

    public StarShipInfo getStarship() {
        return starship;
    }

    public Integer getCrew() {
        return crew;
    }

    public Boolean getIsLeiaOnPlanet() {
        return isLeiaOnPlanet;
    }

    @Override
    public String toString() {
        return "Information: "+this.starship.toString()+", "+this.crew+", "+this.isLeiaOnPlanet;
    }

    public static class InformationBuilder{
        private StarShipInfo starship;
        private Integer crew;
        private Boolean isLeiaOnPlanet;

        public InformationBuilder(){}

        public InformationBuilder starShip(StarShipInfo starship){
            this.starship = starship;
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
