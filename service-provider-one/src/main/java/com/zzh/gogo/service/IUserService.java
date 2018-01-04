package com.zzh.gogo.service;


import com.baomidou.mybatisplus.service.IService;
import com.zzh.gogo.entity.User;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	public List<User> selectListBySQL();
}