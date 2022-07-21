package com.test.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level getFeignlogger(){
        return Logger.Level.FULL;
    }
//    @Bean
//    public RandomRule randomRule(){
//        return new RandomRule();
//    }
}
