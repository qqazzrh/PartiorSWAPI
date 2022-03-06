package com.rianna.partior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConsumingRestApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
        logger.info("Application started");
    }
}