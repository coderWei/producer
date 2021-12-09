package com.tiantong.producer.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "files")
@Data
public class FileAddress  {

    /**
     * 目录
     */
    private String address;


}
