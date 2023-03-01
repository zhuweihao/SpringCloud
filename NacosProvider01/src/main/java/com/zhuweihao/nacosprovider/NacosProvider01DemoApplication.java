package com.zhuweihao.nacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zhuweihao
 * @Date 2023/3/1 11:24
 * @Description com.zhuweihao.springcloud
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider01DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider01DemoApplication.class,args);
    }
}
