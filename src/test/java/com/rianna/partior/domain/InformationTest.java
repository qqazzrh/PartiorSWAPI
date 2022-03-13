package com.rianna.partior.domain;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;

import static org.junit.jupiter.api.Assertions.*;

class InformationTest {



    @Test
    void test_getCrew() {
        Information.InformationBuilder builder = new Information.InformationBuilder();
        Information info =  builder.crew(123456).build();

        assertEquals(123456,info.getCrew());

    }

}