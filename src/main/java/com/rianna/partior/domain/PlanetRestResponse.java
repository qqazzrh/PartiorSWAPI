package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetRestResponse implements Serializable {
    private Integer count;
    @JsonUnwrapped
    private List<Planet> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Planet> getResults() {
        return results;
    }

    public void setResults(List<Planet> results) {
        this.results = results;
    }

    public String toString(){
        return "PlanetRestResponse: "+this.count+", "+this.results.get(0).toString();

    }
}
