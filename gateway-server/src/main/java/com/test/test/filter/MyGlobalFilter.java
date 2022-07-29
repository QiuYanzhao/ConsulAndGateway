package com.test.test.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 自定义全局过滤器
 *
 * @author QiuYanzhao
 */
@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {

    @Override public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(exchange);//通过过滤器
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
