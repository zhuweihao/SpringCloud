package com.zhuweihao.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhuweihao
 * @Date 2023/3/1 17:38
 * @Description com.zhuweihao.nacosconfig.controller
 */
@RestController
@RefreshScope //通过Spring Cloud原生注解实现配置自动更新
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
