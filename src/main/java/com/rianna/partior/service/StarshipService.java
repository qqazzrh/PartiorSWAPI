package com.rianna.partior.service;

import com.rianna.partior.domain.*;
import com.rianna.partior.processor.InformationProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarshipService {

    @Autowired
    InformationProcessor informationProcessor;


    public Information formFinalResponse(String starshipOwner, String starShipName, String planetName, String lostPerson){
        Information.InformationBuilder builder = new Information.InformationBuilder();
        builder.starShip(getStarship(starshipOwner))
        .crew(informationProcessor.getSWCrewNumber(starShipName))
        .isLeiaOnPlanet(informationProcessor.isPersonOnPlanet(lostPerson,planetName));

        return builder.build();

    }


    private StarShip getStarship(String starshipOwner) {
        StarShip starship = informationProcessor.getSWStarShip(starshipOwner);
        return starship;
    }

}
