package com.miaowen.demo.sofaconsumer.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.alipay", "com.miaowen"})
public class SofaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SofaConsumerApplication.class);

		springApplication.run(args);
	}
}
