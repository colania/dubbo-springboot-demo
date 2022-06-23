package com.matt.consumer.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
public class CustomerLeaveMessageEvent extends ApplicationEvent {

    public CustomerLeaveMessageEvent(Object source) {
        super(source);
    }
}
