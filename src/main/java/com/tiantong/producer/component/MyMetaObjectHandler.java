package com.tiantong.producer.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


/**
 * mybatis-plus 自动填充时间方法
 * @author wei
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTs", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "lastUpdTs", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "createTs", LocalDateTime::now, LocalDateTime.class);
        // 默认提供的strictUpdateFill为有值不覆盖， gmtModified需要覆盖，利用通用塞值的方法填充
        this.setFieldValByName("lastUpdTs", LocalDateTime.now(), metaObject);
    }

}
