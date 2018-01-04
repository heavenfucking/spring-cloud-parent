package com.zzh.gogo.entity;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 用户表
 */
@SuppressWarnings("serial")
public class User extends SuperEntity<User> {

    @TableField(value = "name")
    private String name;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "phone")
    private String phone;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
