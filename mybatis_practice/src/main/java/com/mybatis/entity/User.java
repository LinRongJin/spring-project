package com.mybatis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private int id;
    private String username;
    private String sex;
    private int age;

    public void setUser(int id,String username,String sex,int age){
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.username = username;
    }
}
