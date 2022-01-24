package com.rkk.spring.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSampleApplication.class, args);
    }

}
