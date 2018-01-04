package com.zzh.gogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
public class ServiceProviderOneApplication {


	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceProviderOneApplication.class).web(true).run(args);
		//SpringApplication.run(ServiceProviderOneApplication.class, args);
	}
}
