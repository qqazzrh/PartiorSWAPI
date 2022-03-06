package com.rianna.partior.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleRestResponse implements Serializable {
    private Integer count;
    private String status;
    private String url;

    @JsonUnwrapped
    private List<People> results;

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

    public List<People> getResults() {
        return results;
    }

    public void setResults(List<People> results) {
        this.results = results;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString(){
        return "PeopleRestResponse: "+this.count+", "+this.results.get(0).toString();

    }
}
