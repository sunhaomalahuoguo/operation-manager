package com.sumavision.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients(basePackages = "com.sumavision.operation")
@EnableEurekaClient
@SpringBootApplication
public class operation_manager_04_trade_consumer {
    public static void main(String[] args) {
        SpringApplication.run(operation_manager_04_trade_consumer.class,args);
    }
}
