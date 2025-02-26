package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cms/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/information")
    public String getInformation() {
        return userService.getUserNameById("1111");
    }
}
