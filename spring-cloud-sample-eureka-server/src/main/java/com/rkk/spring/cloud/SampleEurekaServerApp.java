package com.rkk.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SampleEurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(SampleEurekaServerApp.class, args);
    }

}
