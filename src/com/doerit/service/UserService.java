package com.doerit.service;

import com.doerit.dao.UserMapper;
import com.doerit.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserService {

    //this is the service class.this execute mapper class
    private UserMapper userMapper;

    //this is the method to insert user POJO data
    public int insertBy(User user) {
        return userMapper.insert(user);

    }

    public List<User> getNames(String name) {
        List<User> names;

        names = userMapper.searchByName("%" + name + "%");

        System.out.println("*****************");
        System.out.println(names.toString() + " This is the list");
        System.out.println("*****************");

        return names;
    }



    public UserMapper getUserMapper() {
        return userMapper;
    }

    //bean injected from bean config file
    public void setUsermapper(UserMapper usermapper) {
        this.userMapper = usermapper;
    }
}
