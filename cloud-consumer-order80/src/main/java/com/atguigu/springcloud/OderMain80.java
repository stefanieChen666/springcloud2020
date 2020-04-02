package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-03-31 20:04
 **/
@SpringBootApplication
@EnableEurekaClient
public class OderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderMain80.class,args);
    }
}
