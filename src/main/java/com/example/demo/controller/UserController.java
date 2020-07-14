package com.example.demo.controller;

import com.example.demo.pojo.entity.Item;
import com.example.demo.pojo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

    @RequestMapping("/addUser")
    public int add (User user, Item item){
        return 1;
    }

    @RequestMapping("/deleteUser")
    public int delete (User user, Item item){
        return 1;
    }

    @RequestMapping("/updateUser")
    public int update (User user, Item item){
        return 1;
    }
}
