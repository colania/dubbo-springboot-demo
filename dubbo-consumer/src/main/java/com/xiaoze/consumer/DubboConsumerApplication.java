package com.xiaoze.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * DubboConsumerApplication
 * 消费者启动类
 * @author xiaoze
 * @date 2018/6/7
 */
@ImportResource("classpath:application-context.xml")
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
