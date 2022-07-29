package com.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderController {

    @GetMapping("/provider")
    public String test(){
        log.info("provider");
        return  "provider";
    }
    @GetMapping("/provider/{id}")
    public String test1(@PathVariable("id")Integer id){
        return  "hello" + id;
    }
}
