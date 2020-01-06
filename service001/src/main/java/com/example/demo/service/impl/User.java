package com.example.demo.service.impl;


import com.example.demo.dao.userMapper;
import com.example.demo.model.user;
import com.example.demo.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class User implements IUser {

    @Autowired
    userMapper uuserMapper;

    @Override
    public user getUser() {
        user testuser = uuserMapper.selectByPrimaryKey(1);
        return testuser;
    }
}
