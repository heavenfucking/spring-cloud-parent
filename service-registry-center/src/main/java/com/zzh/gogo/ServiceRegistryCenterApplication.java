package com.zzh.gogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer             //声明euraka注册中心
public class ServiceRegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryCenterApplication.class, args);
	}

}
