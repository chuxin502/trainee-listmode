package com.example.demo.service;

import com.example.demo.pojo.entity.Item;
import com.example.demo.pojo.entity.User;

public interface UserService {
    int addShoppingItem(Item item, User user);

    int deleteShoppingItem(Item item, User user);

    int updateShoppingItem(Item item, User user);
}
