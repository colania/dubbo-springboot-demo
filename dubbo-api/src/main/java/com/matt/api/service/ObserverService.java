package com.matt.api.service;

import com.matt.api.dto.CustomerLeaveMessageDTO;
import com.matt.api.response.ResponseData;

/**
 * @description:
 * @author：wwei
 * @date: 2022/6/26
 */
public interface ObserverService {

    ResponseData observerTest(CustomerLeaveMessageDTO dto);
}
