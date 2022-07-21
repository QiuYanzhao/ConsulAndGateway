package com.test.service;

import com.test.config.FeignConfig;
import com.test.service.impl.ConsumerServiceFallbackFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value = "service-provider",configuration = FeignConfig.class,fallback = ConsumerServiceImpl.class)
@FeignClient(value = "service-provider",configuration = FeignConfig.class,fallbackFactory = ConsumerServiceFallbackFactory.class)
public interface ConsumerService {
//    public String consumer();
        @GetMapping("/provider/")
        @Cacheable(cacheNames = "providerCacheTest")
        public String test();
}
