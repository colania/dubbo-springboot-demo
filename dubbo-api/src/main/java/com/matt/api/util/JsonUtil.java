package com.matt.api.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * @description:
 * @author：wwei
 * @date: 2022/6/26
 */

@Slf4j
public class JsonUtil {
    // 默认jackson对象
    private static ObjectMapper defaultObjectMapper = new ObjectMapper();

    //根据项目需要自定义配置
    static {
        defaultObjectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)//解决SerializationFeature.FAIL_ON_EMPTY_BEANS异常
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)//属性值为null的不参与序列化
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);//反序列化时忽略对象中不存在的json字段
    }

    //将字符串转成对象
    public static <T> T parseObject(String text, Class<T> clazz) {
        T obj = null;
        if (!StringUtils.isEmpty(text)) {
            try {
                obj = defaultObjectMapper.readValue(text, clazz);
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return obj;
    }

    /**
     * @Description  字符串转ObjectNode
     **/
    public static ObjectNode toObjectNode(String text) {
        ObjectNode objectNode = null;
        if (!StringUtils.isEmpty(text)) {
            try {
                objectNode = (ObjectNode) defaultObjectMapper.readTree(text);
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return objectNode;
    }

    /**
     * 对象转json
     * @param object
     * @return
     */
    public static String toJSONString(Object object) {
        String res = null;
        try {
            res = defaultObjectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage(), e);
        }
        return res;
    }

//这里仅贴出常用方法，大家可以根据自己需求进行封装
}
