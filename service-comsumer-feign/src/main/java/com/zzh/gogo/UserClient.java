package com.zzh.gogo;

import com.zzh.gogo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:zhuhao
 * @Description:
 * @Date:
 **/
@FeignClient("service-provider-one")
public interface UserClient {

    @RequestMapping("/user")
    User home() ;

}
