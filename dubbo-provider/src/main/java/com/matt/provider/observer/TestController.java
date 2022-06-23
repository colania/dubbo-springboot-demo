package com.matt.provider.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
@RestController
public class TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/test")
    public void test() {
        CustomerLeaveMessage msg = new CustomerLeaveMessage();
        applicationContext.publishEvent(new CustomerLeaveMessageEvent(msg));

    }
}
