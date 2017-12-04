package com.doerit.service;

import com.doerit.dao.UserMapper;
import com.doerit.model.User;

import java.sql.SQLException;


public class UserService {


    private UserMapper userMapper;

    public int insertBy(User user) {
        return userMapper.insert(user);

    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUsermapper(UserMapper usermapper) {
        this.userMapper = usermapper;
    }
}
