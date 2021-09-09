package com.example.aboutmeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AboutMeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AboutMeServiceApplication.class, args);
    }

}
