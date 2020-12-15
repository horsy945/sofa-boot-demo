package com.alipay.sofa.consumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * 这个注解无效，没有被执行
 * @author miaowen
 * @since 2020/12/3 16:53
 */
@Configuration
@Slf4j
public class ConsumerDaoConfig {
    public ConsumerDaoConfig() {
        log.info("start to scan mapper file. ");
    }

    /* todo Configuration 类的方式发布sofa-service，注解没被扫描
    @Bean("mobileRepository")
    @SofaService(uniqueId = "mobileJvmService", interfaceType = MobileDubboService.class)
    public MobileDubboService mobileRepository(){
        log.info("publish mobileJvmService");
        return new MobileRepositoryImpl();
    }
    */
}
