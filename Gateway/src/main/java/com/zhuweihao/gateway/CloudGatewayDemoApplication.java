package com.zhuweihao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zhuweihao
 * @Date 2023/3/3 10:40
 * @Description com.zhuweihao.gateway
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayDemoApplication.class, args);
    }
}
