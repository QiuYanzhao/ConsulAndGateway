package com.test.test.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * Gateway限流策略配置类
 * 注：容器中同时只能有一种限流策略
 *
 * @author QiuYanzhao
 */

@Configuration
public class KeyResolverConfiguration {

    /**
     * 根据url进行限流
     * @return
     */
    @Bean
    public KeyResolver pathKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getURI().getPath());
    }

    /**
     * 根据参数进行限流
     * @return
     */
//    @Bean
    public KeyResolver parameterKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }

    /**
     * 根据ip进行限流
     * @return
     */
//    @Bean
    public KeyResolver ipKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
