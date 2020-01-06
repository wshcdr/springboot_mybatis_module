package com.example.demo.service.impl;

import com.example.demo.dao.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.user;


@SpringBootTest
class UserTest {

    @Autowired
    userMapper _userDao;

    @Test
    void getUser() {
        user _userinfo = _userDao.selectByPrimaryKey(39);
        System.out.println(_userinfo.getUsername());
    }
}