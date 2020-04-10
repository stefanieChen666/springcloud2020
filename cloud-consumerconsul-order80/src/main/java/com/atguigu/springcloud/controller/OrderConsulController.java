package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-09 16:59
 **/
@RestController
@Slf4j
@RequestMapping(value = "comsumer")
public class OrderConsulController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    /**
     * http://localhost/consumer/payment/zk
     *
     * @return
     */
    @GetMapping
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }
}
