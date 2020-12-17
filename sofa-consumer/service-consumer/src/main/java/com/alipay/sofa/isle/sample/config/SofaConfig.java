package com.alipay.sofa.isle.sample.config;

import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import com.alipay.sofa.isle.sample.service.SampleConsumerSofaJvmService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaowen
 * @since 2020/12/11 11:42
 */
@Configuration
@Slf4j
@ConditionalOnProperty(name = "application.run.jvm")
public class SofaConfig {

    @SofaReference(uniqueId = "mobileServiceJvm")
    private SampleSofaJvmService sampleJvmService;

    /**
     * 条件装配方式暴露sofaJvm 服务
     * @return sofaJvm 服务bean
     */
    @Bean("sampleClientSofaJvmService")
    @SofaService(uniqueId = "consumerJvm", interfaceType = SampleSofaJvmService.class)
    public SampleSofaJvmService sampleClientSofaJvmService(){
        return new SampleConsumerSofaJvmService();
    }

    /**
     * sofa jvm 服务引用
     * @return
     */
    @Bean(name = "sampleJvmService")
    public SampleSofaJvmService sampleJvmService(){
        return sampleJvmService;
    }
}
