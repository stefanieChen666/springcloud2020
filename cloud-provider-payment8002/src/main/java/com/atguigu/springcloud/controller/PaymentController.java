package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-03-30 21:31
 **/
@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping
    public CommonResult create(@RequestBody Payment payment){
       int result=paymentService.create(payment);
        if (result>0){
            return new CommonResult(200,"插入数据成功,servepot"+serverPort,payment);
        }else{
            return new CommonResult(444,"插入数据失败",payment);
        }
    }
    @GetMapping(value = "/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment= paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"查询数据成功,servepot"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败，查询id"+id);
        }
    }
    @GetMapping("/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for(String element:services)
        {
            log.info(element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance:instances)
        {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
