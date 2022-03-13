package com.rianna.partior.controller;

import com.rianna.partior.domain.Information;
import com.rianna.partior.service.StarshipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@ControllerAdvice
@EnableSwagger2
public class SwController {

    @Autowired
    StarshipService starshipService;

    private static final Logger logger = LoggerFactory.getLogger(SwController.class);

    @RequestMapping(value = "/information", produces = "application/json" ,method = RequestMethod.GET)
    public Information getInformation() {
            Information info = starshipService.formFinalResponse("Darth Vader", "Death Star", "Alderaan", "Leia Organa");
            logger.info("information fetched [{}]", info.toString());
            return info ;
    }

    @RequestMapping(value = "/customized/information", produces = "application/json" ,method = RequestMethod.GET)
    public Information getInformation(@RequestParam String owner, @RequestParam String starship, @RequestParam String planet, @RequestParam String lostPerson ) {
        Information info = starshipService.formFinalResponse(owner,starship,planet,lostPerson);
        logger.info("information fetched [{}]", info.toString());
        return info ;
    }


}
