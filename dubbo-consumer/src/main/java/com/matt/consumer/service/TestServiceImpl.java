package com.matt.consumer.service;

import com.matt.consumer.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public int test() {
        return testMapper.count();
    }
}
