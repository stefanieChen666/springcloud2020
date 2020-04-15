package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-15 19:53
 **/
@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private  String port;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {

        return port+configInfo;
    }
}
