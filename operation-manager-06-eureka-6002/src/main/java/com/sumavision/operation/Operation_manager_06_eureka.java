package com.sumavision.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Operation_manager_06_eureka {
    public static void main(String[] args) {
        SpringApplication.run(Operation_manager_06_eureka.class,args);
    }
}
