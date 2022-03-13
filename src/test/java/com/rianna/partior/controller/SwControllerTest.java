package com.rianna.partior.controller;

import com.rianna.partior.domain.Information;
import com.rianna.partior.service.StarshipService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;


import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.BDDMockito.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SwControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private StarshipService starshipService;

    @Autowired
    SwController swController;

    @Test
    void test_getInformation() throws Exception {

        Information info = new Information.InformationBuilder().crew(123).isLeiaOnPlanet(true).build();

        given(starshipService.formFinalResponse
                ("Darth Vader", "Death Star", "Alderaan", "Leia Organa"))
        .willReturn(info);

        Information response = swController.getInformation();
                //restTemplate.getForEntity("/information", Information.class);

        assertThat(response.getCrew()).isEqualTo(123);
        assertThat(response.getIsLeiaOnPlanet()).isEqualTo(true);



    }
}