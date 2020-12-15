package com.alipay.sofa.isle.sample.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.alipay" })
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ServiceApplication.class);

		springApplication.run(args);	}
}
