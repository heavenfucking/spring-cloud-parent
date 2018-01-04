package com.zzh.gogo.mapper;


import com.zzh.gogo.SuperMapper;
import com.zzh.gogo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

}