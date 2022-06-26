package com.matt.provider.service.impl;

import com.matt.api.dto.CustomerLeaveMessageDTO;
import com.matt.api.response.ResponseData;
import com.matt.api.service.ObserverService;
import com.matt.provider.observer.CustomerLeaveMessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：wwei
 * @date: 2022/6/26
 */
@Service
public class ObserverServiceImpl implements ObserverService {
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    public ResponseData observerTest(CustomerLeaveMessageDTO dto) {
        applicationContext.publishEvent(new CustomerLeaveMessageEvent(dto));
        return new ResponseData<>();
    }
}
