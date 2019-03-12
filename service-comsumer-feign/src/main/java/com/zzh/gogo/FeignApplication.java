package com.zzh.gogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class FeignApplication {

    @Autowired
    private UserClient userClient;

    @GetMapping(value = "/user")
    public Object hello() {
        return  userClient.home();
    }


    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
