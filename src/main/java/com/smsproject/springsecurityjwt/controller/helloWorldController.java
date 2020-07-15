package com.smsproject.springsecurityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.smsproject.springsecurityjwt.service.UserInfoService;
import com.smsproject.springsecurityjwt.model.User;

@RestController
public class helloWorldController {

    @Autowired
    private UserInfoService userinfoservice;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello Spring App";
    }

    @GetMapping("/userdetails/{user}")
    public User getUserDetails(@PathVariable String user){
        return userinfoservice.get(user);
    }

}
