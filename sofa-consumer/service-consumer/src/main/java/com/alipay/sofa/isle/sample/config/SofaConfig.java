package com.alipay.sofa.isle.sample.config;

import com.alipay.sofa.isle.sample.SampleDubboService;
import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import com.alipay.sofa.isle.sample.service.SampleConsumerSofaJvmService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaowen
 * @since 2020/12/11 11:42
 */
@Configuration
@Slf4j
public class SofaConfig {

    @Reference
    private SampleDubboService sampleDubboService;

    @Bean(name = "sampleDubboService")
    public SampleDubboService sampleDubboService() {
        return sampleDubboService;
    }

    @Bean("sampleClientSofaJvmService")
    @SofaService(uniqueId = "consumerJvm", interfaceType = SampleSofaJvmService.class)
    public SampleSofaJvmService sampleClientSofaJvmService(){
        return new SampleConsumerSofaJvmService();
    }
}
