package com.xiaoze.consumer.controller;

import com.xiaoze.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DemoConsumerController
 * 消费者控制层
 * @author xiaoze
 * @date 2018/6/7
 */
@RestController
public class DemoConsumerController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                System.out.println(demoService.sayHello(name));
            }).start();
        }
        return null;
    }

}
