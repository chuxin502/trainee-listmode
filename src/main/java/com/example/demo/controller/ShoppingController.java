package com.example.demo.controller;

import com.example.demo.pojo.entity.Shopping;

import com.example.demo.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;

    @PostMapping("/add")
    public int add(@RequestBody Shopping shopping) {
        return shoppingService.addShoppingItem(shopping);
    }

    @RequestMapping("/delete")
    public int delete(Shopping shopping) {
        return 1;
    }

    @RequestMapping("/update")
    public int update(Shopping shopping) {
        return 1;
    }

}
