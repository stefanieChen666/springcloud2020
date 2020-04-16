package com.atguigu.springcloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import com.atguigu.springcloud.service.IMessageProvider;

import javax.annotation.Resource;

import java.util.UUID;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-16 16:05
 **/
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String Serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(Serial).build());
        log.info("****Serial"+Serial);
        return null;
    }
}
