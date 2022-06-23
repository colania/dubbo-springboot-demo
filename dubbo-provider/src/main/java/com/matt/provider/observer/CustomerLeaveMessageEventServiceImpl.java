package com.matt.provider.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
@Service
public class CustomerLeaveMessageEventServiceImpl implements ApplicationListener<CustomerLeaveMessageEvent> {
    @Override
    public void onApplicationEvent(CustomerLeaveMessageEvent customerLeaveMessageEvent) {
        System.out.println("用户留言后的逻辑响应，发送站内通知给管理员：" + customerLeaveMessageEvent.toString());
    }
}
