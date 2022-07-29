package com.test.test.config;

import com.test.test.filter.MyGatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置Gateway路由规则和过滤器的配置类
 *
 * @author QiuYanzhao
 */

@Configuration
public class GatewayRoutesConfiguration {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(r -> r
                //断言（判断条件）
                .path("/product/**")
                //目标URI，路由到微服务的地址
                .uri("lb://product-service")
                //注册自定义网关过滤器
                .filters(new MyGatewayFilter())
                //路由ID
                .id("product-service"))
                .build();
    }
}
