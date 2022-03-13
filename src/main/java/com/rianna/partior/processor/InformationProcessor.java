package com.rianna.partior.processor;

import com.rianna.partior.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InformationProcessor {
    private static final Logger logger = LoggerFactory.getLogger(InformationProcessor.class);

    @Autowired
    SwApiFetcher swApiFetcher;

    public StarShip getSWStarShip(String name) {

        People starshipOwner = swApiFetcher.getPeopleFromName(name);
        //This can actually be a list if owner has multiple startships.
        //but in this case, since we only want one start ship, return one only
        if(starshipOwner==null || starshipOwner.getStarships().size() == 0){
            return new StarShip();
        }
        String starShipApi =  starshipOwner.getStarships().get(0);
        return swApiFetcher.getStarShipFromUrl(starShipApi);
    }

    public Integer getSWCrewNumber(String name) {
        StarShip starShip = swApiFetcher.getStarShipFromName(name);
        if(starShip==null || starShip.getCrew()==null){
            logger.info("No starship/starship crew fetched: " + name);
            return 0;
        }
        logger.info("Fetched starship info:" + starShip.toString());
        return starShip.getCrew();

    }

    public Boolean isPersonOnPlanet(String personName, String planetName) {
        Planet planet = swApiFetcher.getPlanetFromName(planetName);
        String personUrl = swApiFetcher.getPeopleFromName(personName).getUrl();
        logger.info("Comparing planet people list with person list");
        return planet.getResidents().stream().anyMatch(s -> s.contains(personUrl));
    }

}
