package com.alipay.sofa.isle.sample.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.alipay"})
@ImportResource(locations = {"classpath:META-INF/spring/dubbo-provide.xml"})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServiceApplication.class);

        springApplication.run(args);
    }
}
