package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCaching
@SpringBootApplication
@EnableFeignClients
public class ConsumerStarterServer {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarterServer.class,args);
    }
//    @Bean RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
