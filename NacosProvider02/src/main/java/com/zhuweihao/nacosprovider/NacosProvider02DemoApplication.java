package com.zhuweihao.nacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zhuweihao
 * @Date 2023/3/1 15:52
 * @Description com.zhuweihao.nacosprovider
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider02DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider02DemoApplication.class,args);
    }
}
