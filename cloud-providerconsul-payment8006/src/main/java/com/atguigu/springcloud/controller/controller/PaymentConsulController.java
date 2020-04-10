package com.atguigu.springcloud.controller.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-09 16:53
 **/
@RestController
@Slf4j
@RequestMapping(value = "payment")
public class PaymentConsulController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/consul")
    public String paymentConsul() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}

