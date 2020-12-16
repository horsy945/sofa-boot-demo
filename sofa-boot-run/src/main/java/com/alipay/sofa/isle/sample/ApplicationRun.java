package com.alipay.sofa.isle.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RootContent 的启动类，要加scanBasePackages，不然扫描的包是当前包
 * @author miaowen 18/5/5
 */
@SpringBootApplication(scanBasePackages = "com.alipay.sofa")
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationRun.class);
        springApplication.run(args);

    }
}
