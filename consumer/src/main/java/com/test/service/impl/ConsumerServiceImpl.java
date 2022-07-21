package com.test.service.impl;

import com.test.service.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {

    @Override public String test() {
        return "失败回调";
    }
}
