package com.rianna.partior.controller;

import com.rianna.partior.domain.Information;
import com.rianna.partior.service.StarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
public class SwController {

    //TODO: 1. clean up code; 2. add test; 3. error handling; 4. customized input; 5. cleanup maven

    @Autowired
    StarshipService starshipService;

    @RequestMapping(value = "/information", produces = "application/json" ,method = RequestMethod.GET)
    public Information getInformation() {
            Information info = starshipService.formFinalResponse("Darth Vader", "Death Star", "Alderaan", "Leia Organa");
            return info ;
    }
}
