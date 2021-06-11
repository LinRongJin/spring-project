package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    @Select("select * from user")
     List<User> allUser();

    @Select("select * from user where username = #{username}")
    public User oneUser(String username);

    @Delete("delete from user where username = #{username}")
    public void deleteUser(String user);

    @Insert("intsert into user (id,username,sex,age) values (#{id},#{username},#{sex},#{age}")
    public void addUser(User user);

    @Update("update user set id = #{id},username = #{username},sex = #{sex},age = #{age} where username = #{username}")
    public void updateUser(User user);

}
