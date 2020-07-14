package com.example.demo.service.impl;

import com.example.demo.pojo.entity.Item;
import com.example.demo.pojo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int addShoppingItem(Item item, User user) {
        return 0;
    }

    @Override
    public int deleteShoppingItem(Item item, User user) {
        return 0;
    }

    @Override
    public int updateShoppingItem(Item item, User user) {
        return 0;
    }

}
