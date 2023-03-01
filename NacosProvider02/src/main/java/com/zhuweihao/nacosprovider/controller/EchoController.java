package com.zhuweihao.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhuweihao
 * @Date 2023/3/1 15:54
 * @Description com.zhuweihao.nacosprovider.controller
 */
@RestController
public class EchoController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + serverPort + string;
    }
}
