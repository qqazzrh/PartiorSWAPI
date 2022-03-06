package com.rianna.partior.processor;

import com.rianna.partior.domain.StarShip;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SwApiFetcherTest {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SwApiFetcher swApiFetcher;

    @Before
    public void setup(){


    }
    @Test
    void getPeopleFromName() {
    }

    @Test
    void getPlanetFromName() {
    }

    @Test
    void test_getStarShipFromName_whenFound() {
        StarShip starShip = swApiFetcher.getStarShipFromName("Death");

        assertEquals("https://swapi.dev/api/starships/9/",starShip.getUrl() );
    }

    @Test
    void test_getStarShipFromName_whenNull() {
        StarShip starShip = swApiFetcher.getStarShipFromName("dummu");

        assertEquals(null,starShip );
    }


    @Test
    void getStarShipFromUrl() {
    }
}