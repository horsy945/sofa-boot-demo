package com.miaowen.demo.sofaconsumer.config;

import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaowen
 * @since 2020/12/17 10:14
 */
@Configuration
public class DubboConsumerConfig {
    @Reference(check = false)
    private SampleSofaJvmService sampleSofaJvmService;

    @Bean(name = "sampleJvmService")
    public SampleSofaJvmService sampleJvmService(){
        return sampleSofaJvmService;
    }
}
