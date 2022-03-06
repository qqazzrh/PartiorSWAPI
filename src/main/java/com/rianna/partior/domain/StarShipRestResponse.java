package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarShipRestResponse implements Serializable {
    private Integer count;
    private String status;
    @JsonUnwrapped
    private List<StarShip> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<StarShip> getResults() {
        return results;
    }

    public void setResults(List<StarShip> results) {
        this.results = results;
    }

    public String toString(){
        return "StarShipRestResponse: "+this.count+", "+this.results.get(0).toString();

    }
}
