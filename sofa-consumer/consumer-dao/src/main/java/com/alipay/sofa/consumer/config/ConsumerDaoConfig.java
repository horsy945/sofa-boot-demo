package com.alipay.sofa.consumer.config;

import com.alipay.sofa.consumer.dao.mapper.ConsumerMobileMapper;
import com.alipay.sofa.consumer.repository.MobileRepositoryImpl;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
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

    @Bean("mobileRepository")
    @SofaService(uniqueId = "mobileJvmService", interfaceType = MobileDubboService.class)
    public MobileDubboService mobileRepository(ConsumerMobileMapper consumerMobileMapper){
        log.info("publish mobileJvmService, consumerMobileMapper = {}" , consumerMobileMapper);
        return new MobileRepositoryImpl(consumerMobileMapper);
    }
}
