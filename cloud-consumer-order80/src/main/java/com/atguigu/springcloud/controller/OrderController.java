package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-03-31 20:06
 **/
@RestController
@Slf4j
@RequestMapping("consumer/payment")
public class OrderController {
    // 通过在eureka上注册过的微服务名称调用
    public static final String PAYMEN_URL="http://CLOUD-PAYMENT-SERVICE/payment/";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping
    public CommonResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMEN_URL,payment,CommonResult.class);
    }
    @GetMapping("/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMEN_URL+id,CommonResult.class);
    }
}
