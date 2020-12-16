package com.alipay.sofa.isle.sample.config;

import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import com.alipay.sofa.isle.sample.service.impl.SampleSofaJvmServiceImpl;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用条件装配方式暴露sofa jvm service
 * @author miaowen
 * @since 2020/12/16 16:38
 */
@Configuration
@ConditionalOnProperty(name = "application.run.jvm")
public class ServiceSofaConfig {

    @Bean("sampleSofaJvmService")
    @SofaService(uniqueId = "mobileServiceJvm", interfaceType = SampleSofaJvmService.class)
    public SampleSofaJvmService sampleSofaJvmService(){
        return new SampleSofaJvmServiceImpl();
    }
}
