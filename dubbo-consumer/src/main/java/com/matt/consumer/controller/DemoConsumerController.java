package com.matt.consumer.controller;

import com.matt.api.constant.MsgEventTypeEnum;
import com.matt.api.dto.CustomerLeaveMessageDTO;
import com.matt.api.response.ResponseData;
import com.matt.api.service.DemoService;
import com.matt.api.service.ObserverService;
import com.matt.consumer.service.TestService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class DemoConsumerController {
    @Resource
    private TestService testService;
    @Resource
    private DemoService demoService;
    @Resource
    private ObserverService observerService;

    @RequestMapping("/sayHello/{name}")
    public ResponseData sayHello(@PathVariable("name") String name) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(demoService.sayHello(name));
            }).start();
        }
        log.info("sayhello");
        return null;
    }


    @RequestMapping("/sayHello2")
    public ResponseData sayHello2() {
        int test = testService.test();
        System.out.println(test);
        log.info("sayhello2");
        return null;
    }

    @GetMapping("/testEvent")
    public ResponseData testEvent() {
        CustomerLeaveMessageDTO msg = new CustomerLeaveMessageDTO();
        msg.setType(MsgEventTypeEnum.SEND_MSG_TO_ADMINISTRATOR);
        observerService.observerTest(msg);
        log.info("testEvent");
        return null;
    }
}
