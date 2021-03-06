package com.peopleFlow.peopleFlow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.peopleFlow.peopleFlow.model")
public class PeopleFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleFlowApplication.class, args);
    }

}