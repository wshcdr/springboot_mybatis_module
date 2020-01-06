package com.example.demo.controller;


import com.example.demo.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    IUser userService;

    @GetMapping("indexData")
    @ResponseBody
    public void indexData(){
        userService.getUser();
    }
}
