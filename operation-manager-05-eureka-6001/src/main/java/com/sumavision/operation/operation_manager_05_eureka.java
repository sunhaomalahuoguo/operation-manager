package com.sumavision.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class operation_manager_05_eureka {
    public static void main(String[] args) {
        SpringApplication.run(operation_manager_05_eureka.class,args);
    }
}
