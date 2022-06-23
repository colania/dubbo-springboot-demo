package com.matt.consumer.observer;

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
        CustomerLeaveMessage source = (CustomerLeaveMessage)event.getSource();
        Integer type = source.getType();
        if (type ==1){
            System.out.println("发送邮件给管理员");
        }

    }
}
