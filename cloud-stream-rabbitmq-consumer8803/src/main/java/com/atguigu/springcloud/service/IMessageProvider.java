package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public interface IMessageProvider {
    public String send();
}
