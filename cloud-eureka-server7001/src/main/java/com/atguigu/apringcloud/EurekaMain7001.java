package com.atguigu.apringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-01 15:14
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaMain7001.class,args);
    }
}
