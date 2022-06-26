package com.matt.provider.observer;

import com.matt.api.constant.MsgEventTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
@Service
@Slf4j
public class CustomerLeaveMessageEventServiceImpl implements ApplicationListener<CustomerLeaveMessageEvent> {
    @Override
    public void onApplicationEvent(CustomerLeaveMessageEvent event) {
        CustomerLeaveMessage msg = (CustomerLeaveMessage) event.getSource();
        if (msg.getType() != MsgEventTypeEnum.SEND_MSG_TO_ADMINISTRATOR) {
            return;
        }
        log.info("CustomerLeaveMessageEvent event ");
        System.out.println("用户留言后的逻辑响应，发送站内通知给管理员：" + event.toString());
    }
}
