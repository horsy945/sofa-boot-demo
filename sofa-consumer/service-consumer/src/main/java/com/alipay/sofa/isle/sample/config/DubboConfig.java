package com.alipay.sofa.isle.sample.config;

import com.alipay.sofa.isle.sample.SampleDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaowen
 * @since 2020/12/17 09:34
 */
@Configuration
public class DubboConfig {
    @Reference(check = false)
    private SampleDubboService sampleDubboService;

    @Bean(name = "sampleDubboService")
    public SampleDubboService sampleDubboService() {
        return sampleDubboService;
    }

}
