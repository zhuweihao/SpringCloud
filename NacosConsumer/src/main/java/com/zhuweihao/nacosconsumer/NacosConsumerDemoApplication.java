package com.zhuweihao.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zhuweihao
 * @Date 2023/3/1 16:01
 * @Description com.zhuweihao.nacosconsumer
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerDemoApplication.class, args);
    }
}
