package com.atguigu.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-08 19:51
 **/
@RestController
@Slf4j
@RequestMapping(value = "payment")
public class paymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping
    public String paymentZk() {
        return "SpringCloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
    }


}
