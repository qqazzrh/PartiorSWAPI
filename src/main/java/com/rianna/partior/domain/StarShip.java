package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.*;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE
)
@JsonPropertyOrder({ "name", "class", "model" })
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StarShip {

    @JsonProperty("name")
    private String name;

    @JsonProperty("model")
    private String model;

    @JsonProperty("class")
    private String ssclass;

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

    @JsonGetter("class")
    public String getSsclass() {
        return ssclass;
    }

    @JsonSetter("starship_class")
    public void setSsclass(String ssclass) {
        this.ssclass = ssclass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCrew() {
        return Integer.valueOf(crew.replace(",",""));
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "StarShip: "+ this.crew+", "+this.name +" class :" + this.ssclass;
    }

}
