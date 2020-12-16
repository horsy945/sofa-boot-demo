package com.alipay.sofa.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 这个注解无效，没有被执行
 * @author miaowen
 * @since 2020/12/3 16:53
 */
@Configuration
@MapperScan({"com.alipay.sofa.consumer.dao.mapper" })
@Slf4j
public class ConsumerDaoConfig {
    public ConsumerDaoConfig() {
        log.info("start to scan mapper file. ");
    }

}
