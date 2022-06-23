package com.matt.consumer.controller;

import com.matt.api.service.DemoService;
import com.matt.consumer.observer.CustomerLeaveMessage;
import com.matt.consumer.observer.CustomerLeaveMessageEvent;
import com.matt.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DemoConsumerController
 * 消费者控制层
 *
 * @author matt
 * @date 2022-06-23 18:36:33
 */
@RestController
public class DemoConsumerController {
    @Autowired
    private ApplicationContext applicationContext;
    @Resource
    private TestService testService;
    @Resource
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(demoService.sayHello(name));
            }).start();
        }
        return null;
    }


    @RequestMapping("/sayHello2")
    public String sayHello2() {
        int test = testService.test();
        System.out.println(test);
        return null;
    }

    @GetMapping("/test")
    public void test() {
        CustomerLeaveMessage msg = new CustomerLeaveMessage();
        msg.setType(1);
        applicationContext.publishEvent(new CustomerLeaveMessageEvent(msg));

    }
}
