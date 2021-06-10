package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class UserService implements UserMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> allUser() {
        return userMapper.allUser();
    }
}
