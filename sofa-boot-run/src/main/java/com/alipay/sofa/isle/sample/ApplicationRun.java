package com.alipay.sofa.isle.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * RootContent 的启动类
 * MapperScan 要放在Root工程的 Application 中扫描，不然只有一个生效
 * @author miaowen 18/5/5
 */
//@MapperScan({"com.alipay.sofa.consumer.dao.mapper", "com.alipay.sofa.dao.mapper"})
@SpringBootApplication
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationRun.class);
        springApplication.run(args);

    }
}
