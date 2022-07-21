package com.test.controller;

import com.test.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/consumer")
    public String consumer(){
        return consumerService.test();
    }
}
