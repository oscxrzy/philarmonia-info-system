package com.example.filarmonic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Filarmonic application. This class
 * bootstraps the Spring Boot context. After launching,
 * navigate to http://localhost:8080/ to see the main page.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}