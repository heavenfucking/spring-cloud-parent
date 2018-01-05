package com.zzh.comsumer.controller;


import com.zzh.comsumer.entity.User;
import com.zzh.comsumer.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("users/findUserById")
  public User findByIdFeign(String id) {
    User user =userFeignClient.findByIdFeign(id);
    return user;
  }
}
