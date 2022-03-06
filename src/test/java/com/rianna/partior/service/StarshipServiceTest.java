package com.rianna.partior.service;

import com.rianna.partior.domain.StarShipInfo;
import com.rianna.partior.exceptions.RecordNotFoundException;
import com.rianna.partior.processor.InformationProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StarshipServiceTest {

    @Autowired
    InformationProcessor informationProcessor;
    @Autowired
    StarshipService starshipService;

    @Test
    public void formFinalResponse() {
    }

    @Test(expected  = RecordNotFoundException.class)
    public void test_getStarship_ifNotFound_thenThrowRecordNotFoundException() {

        StarShipInfo startship =   starshipService.getStarship("dummy");

    }

    @Test
    public void test_getStarship_ifFound() {

        StarShipInfo starShipInfo =   starshipService.getStarship("Darth Vader");

        assertNotNull(starShipInfo);
        assertEquals("TIE Advanced x1", starShipInfo.getName());
        assertEquals("Twin Ion Engine Advanced x1", starShipInfo.getModel());
        assertEquals("Starfighter", starShipInfo.getStarship_class());

    }
}