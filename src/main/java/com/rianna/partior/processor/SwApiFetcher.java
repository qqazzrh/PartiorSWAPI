package com.rianna.partior.processor;

import com.rianna.partior.domain.*;
import com.rianna.partior.exceptions.RecordNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwApiFetcher {
    private static final Logger logger = LoggerFactory.getLogger(SwApiFetcher.class);

    @Autowired
    RestTemplate restTemplate;

    public People getPeopleFromName(String PeopleName){
        String searchUrl = "https://swapi.dev/api/people/?search=" + PeopleName;
        logger.info("hit api " + searchUrl);

        PeopleRestResponse peopleRestResponse = restTemplate.getForObject(
                searchUrl , PeopleRestResponse.class);
        if(peopleRestResponse.getCount()<1){
            throw new RecordNotFoundException("Person " + PeopleName +" is not found. API: " + searchUrl);
        }
        People people = peopleRestResponse.getResults().get(0);
        return people;
    }

    public Planet getPlanetFromName(String name){
        String searchUrl = "https://swapi.dev/api/planets/?search=" + name;
        logger.info("hit api " + searchUrl);

        PlanetRestResponse planetRestResponse = restTemplate.getForObject(
                searchUrl , PlanetRestResponse.class);
        if(planetRestResponse.getCount()<1){
            return null;
        }
        Planet planet = planetRestResponse.getResults().get(0);
        return planet;
    }

    public StarShip getStarShipFromName(String name) {
        String searchUrl = "https://swapi.dev/api/starships/?search=" + name;
        logger.info("hit api " + searchUrl);

        StarShipRestResponse starShipRestResponse  = restTemplate.getForObject(
                searchUrl, StarShipRestResponse.class);

        if(starShipRestResponse.getCount()<1){
            return null;
        }
        StarShip starShip = starShipRestResponse.getResults().get(0);
        logger.info(starShip.toString());

        return starShip;

    }
    public StarShip getStarShipFromUrl(String url){
        logger.info("hit api " + url);

        StarShip starShip = restTemplate.getForObject(
                url , StarShip.class);

        //TODO: what if wrong url?
        logger.info(starShip.toString());

        return starShip;
    }

}
