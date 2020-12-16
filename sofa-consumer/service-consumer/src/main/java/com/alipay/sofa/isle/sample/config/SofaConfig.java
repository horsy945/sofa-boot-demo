package com.alipay.sofa.isle.sample.config;

import com.alipay.sofa.isle.sample.JvmServiceConsumer;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.SampleJvmService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
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

//    @Reference
//    private MobileDubboService mobileDubboService;

//    @Bean
//    public JvmServiceConsumer jvmServiceConsumer(@SofaReference(uniqueId = "sampleJvmServiceXml") SampleJvmService sampleJvmService){
//        log.info("sofaJvmService is : " + sampleJvmService);
//        return new JvmServiceConsumer(sampleJvmService);
//    }

    @Bean(name = "mobileJvmService")
    public MobileDubboService mobileJvmService(@SofaReference(uniqueId = "mobileJvmService") MobileDubboService mobileJvmService) {
        return mobileJvmService;
    }

}
