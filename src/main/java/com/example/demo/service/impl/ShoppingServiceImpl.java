package com.example.demo.service.impl;

import com.example.demo.dao.ShoppingMapper;
import com.example.demo.pojo.entity.Item;
import com.example.demo.pojo.entity.Shopping;
import com.example.demo.pojo.entity.User;
import com.example.demo.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public int addShoppingItem(Shopping shopping) {

        return shoppingMapper.buyItem(shopping);
    }

    @Override
    public int deleteShoppingItem(Shopping shopping) {
        return 0;
    }

    @Override
    public int updateShoppingItem(Shopping shopping) {
        return 0;
    }
}
