package com.ddup.api.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @ClassName : MyMetaObjectHandler
 * @AUTHOR :  xianwei
 * @DESCRIPTION : 时间自动更新插件
 * @since JDK 1.8
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        Object createTime = getFieldValByName("createTime", metaObject);
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (createTime == null) {
            setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }

        if (updateTime == null) {
            setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (updateTime == null) {
            setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        }
    }
}
