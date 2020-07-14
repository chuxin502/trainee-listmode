package com.example.demo.dao;

import com.example.demo.pojo.entity.Shopping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingMapper{
    public int buyItem(Shopping shopping);
}

