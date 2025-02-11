package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserNameById(String userName){
        return "这是一个用户名称";
    }
}
