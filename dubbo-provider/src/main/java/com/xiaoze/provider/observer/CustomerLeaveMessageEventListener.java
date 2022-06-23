package com.xiaoze.provider.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
@Service
public class CustomerLeaveMessageEventListener {

    @EventListener
    public void sendEmail(CustomerLeaveMessageEvent event) {
        System.out.println("发送邮件给管理员");
    }
}
