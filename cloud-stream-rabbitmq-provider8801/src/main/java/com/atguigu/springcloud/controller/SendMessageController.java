package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.atguigu.springcloud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-16 16:12
 **/
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
