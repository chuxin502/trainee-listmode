package com.example.demo.service;

import com.example.demo.pojo.entity.Item;
import com.example.demo.pojo.entity.Shopping;
import com.example.demo.pojo.entity.User;

public interface ShoppingService{

    int addShoppingItem(Shopping shopping);

    int deleteShoppingItem(Shopping shopping);

    int updateShoppingItem(Shopping shopping);
}
