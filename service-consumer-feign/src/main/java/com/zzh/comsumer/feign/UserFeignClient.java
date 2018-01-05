package com.zzh.comsumer.feign;

import com.zzh.comsumer.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 * @author eacdy
 */
@FeignClient(name = "parent-provider-user")
public interface UserFeignClient {

    @RequestMapping("users/findUserById")
    User findByIdFeign(@RequestParam("id") String id);
}
