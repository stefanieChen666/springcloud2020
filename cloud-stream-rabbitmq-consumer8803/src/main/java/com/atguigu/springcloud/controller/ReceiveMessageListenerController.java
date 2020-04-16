package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud2020
 * @author: Miss.CHEN
 * @create: 2020-04-16 16:18
 **/
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message)
    {
        log.info("消费者2号,----->接受到的消息: "+message.getPayload()+"\t  port: "+serverPort);
    }
}
