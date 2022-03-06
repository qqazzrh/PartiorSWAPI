package com.rianna.partior.service;

import com.rianna.partior.domain.*;
import com.rianna.partior.processor.InformationProcessor;
import com.rianna.partior.processor.SwApiFetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StarshipService {

    @Autowired
    InformationProcessor informationProcessor;


    public Information formFinalResponse(String starshipOwner, String starShipName, String planetName, String lostPerson){
        Information.InformationBuilder builder = new Information.InformationBuilder();
        builder.starShip(getStarship(starshipOwner))
        .crew(informationProcessor.getSWCrewNumber(starShipName))
        .isLeiaOnPlanet(informationProcessor.isPersonOnPlanet(lostPerson,planetName))
        ;

        Information info = builder.build();
        return info;

    }


    StarShipInfo getStarship(String starshipOwner) {
        if(informationProcessor.getSWStarShip(starshipOwner) == null){
            return null;
        }
        return informationProcessor.getSWStarShip(starshipOwner).castToStarShipInfo();
    }

//        public Information getSWInfomation(String name1, String name2, String starshipName, String planetName){
//        People people1 = new People();
//        People people2 = new People();
//        StarShip starship = new StarShip();
//        Planet planet = new Planet();
//
//
//        //enrich people1 to PeopleInfo
//        //enrich planet to
//
//        //convert to infomation
//
//        ////        // from people Darth Vader -> enrich with list of starship
//        ////        // from planet alderaan -> enrich with number of crew and people
//        return new Information();
//    }
}
