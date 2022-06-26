package com.matt.provider.observer;

import com.matt.api.constant.MsgEventTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
@Service
@Slf4j
public class CustomerLeaveMessageEventListener {

    @EventListener
    public void sendEmail(CustomerLeaveMessageEvent event) {
        CustomerLeaveMessage msg = (CustomerLeaveMessage) event.getSource();
        if (msg.getType() != MsgEventTypeEnum.SEND_EMAIL_TO_ADMINISTRATOR) {
            return;
        }
        log.info("sendEmail event ");
        System.out.println("发送邮件给管理员");
    }
}
