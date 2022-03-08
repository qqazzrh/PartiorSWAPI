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

    //TODO: 1. clean up code; 2. add test; 3. error handling; 4. customized input; 5. cleanup maven

    @Autowired
    StarshipService starshipService;

    private static final Logger logger = LoggerFactory.getLogger(SwController.class);

    @RequestMapping(value = "/information", produces = "application/json" ,method = RequestMethod.GET)
    public Information getInformation() {
            Information info = starshipService.formFinalResponse("Darth Vader", "Death Star", "Alderaan", "Leia Organa");
            logger.info("information fetched [{}]", info.toString());
            return info ;
    }
}
