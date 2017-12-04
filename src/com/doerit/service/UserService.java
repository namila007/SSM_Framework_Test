package com.doerit.service;

import com.doerit.dao.UserMapper;
import com.doerit.model.User;




public class UserService {

    //this is the service class.this execute mapper class
    private UserMapper userMapper;

    //this is the method to insert user POJO data
    public int insertBy(User user) {
        return userMapper.insert(user);

    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    //bean injected from bean config file
    public void setUsermapper(UserMapper usermapper) {
        this.userMapper = usermapper;
    }
}
