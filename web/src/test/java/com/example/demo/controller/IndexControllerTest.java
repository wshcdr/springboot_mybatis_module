package com.example.demo.controller;

import com.example.demo.model.user;
import com.example.demo.service.IUser;
import com.example.demo.service.impl.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.AssertFalse;
import java.io.Console;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IndexControllerTest {
    @Autowired
    User userRep;

    @Test
    void indexData() {
        user _myuser = userRep.getUser();
        System.out.println(_myuser.getUsername());


    }
}