package com.test.service.impl;

import com.test.service.ConsumerService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {

    //获取日志，在需要捕获异常的方法中进行处理
    Logger logger =  LoggerFactory.getLogger(ConsumerServiceFallbackFactory.class);

    @Override public ConsumerService create(Throwable throwable) {
        return new ConsumerService() {
            @Override public String test() {
                logger.error("test方法抛出异常，异常信息：{}",throwable);
                return "触发熔断以后的托底数据";
            }
        };
    }
}
