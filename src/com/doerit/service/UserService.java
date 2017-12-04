package com.doerit.service;

import com.doerit.dao.UserMapper;
import com.doerit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {


    private UserMapper userMapper;

    @Transactional
    public int insertBy(User user) {
        return userMapper.insert(user);

    }



    public User viewByid(String ID) {
        return userMapper.selectByPrimaryKey(Integer.getInteger(ID));
    }
}
