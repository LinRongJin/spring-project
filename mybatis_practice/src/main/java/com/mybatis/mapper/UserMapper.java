package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    public List<User> allUser();

    @Select("select * from user where username = #{username}")
    public List<User> selectOneUser(String username);
}
