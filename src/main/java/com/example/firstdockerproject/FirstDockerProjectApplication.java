package com.example.firstdockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = { })
public class FirstDockerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstDockerProjectApplication.class, args);
    }

}
