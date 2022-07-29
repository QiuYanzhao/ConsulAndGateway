package com.test.test.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 自定义网关过滤器
 *
 * @author QiuYanzhao
 */
public class MyGatewayFilter implements GatewayFilter, Ordered {

    @Override public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        return chain.filter(exchange);//返回此值则通过过滤器
    }

    /**
     * 过滤器执行顺序，order越小，优先级越高
     *
     * @return
     */
    @Override public int getOrder() {
        return 0;
    }
}
