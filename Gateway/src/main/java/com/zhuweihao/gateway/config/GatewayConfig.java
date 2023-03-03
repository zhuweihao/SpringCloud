package com.zhuweihao.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhuweihao
 * @Date 2023/3/3 11:05
 * @Description com.zhuweihao.gateway.config
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route", predicateSpec ->
                predicateSpec.path("/zh-cn")
                        .uri("https://nacos.io/zh-cn")).build();
        return routes.build();
    }
}
