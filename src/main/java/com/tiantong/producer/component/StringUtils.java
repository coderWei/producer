package com.tiantong.producer.component;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StringUtils {
    /**
     * 获取无短杠UUID
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }




}
