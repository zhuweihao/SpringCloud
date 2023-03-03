package com.zhuweihao.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhuweihao
 * @Date 2023/3/3 17:20
 * @Description PACKAGE_NAME
 */
@SpringBootTest
public class testRedis {
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    @Test
    public void testRedis(){

        redisTemplate.opsForValue().set("auth_token:zhuweihao","1");
    }
}
