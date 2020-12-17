package com.miaowen.demo.sofaconsumer.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = { "com.alipay", "com.miaowen"})
@ImportResource(locations = {"classpath:META-INF/spring/dubbo-provide.xml"})
public class SofaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SofaConsumerApplication.class);

		springApplication.run(args);
	}
}
