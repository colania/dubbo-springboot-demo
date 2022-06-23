package com.matt.consumer;

import com.matt.api.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.ServiceLoader;

/**
 * DubboConsumerApplication
 * 消费者启动类
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@ImportResource("classpath:application-context.xml")
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ServiceLoader<DemoService> loaders = ServiceLoader.load(DemoService.class);
        for (DemoService service : loaders) {
            service.sayHello("nihao");
        }
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
