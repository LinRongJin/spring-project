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

    @Override
    public User oneUser(String username) {
        return userMapper.oneUser(username);
    }

    @Override
    public void deleteUser(String user) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
