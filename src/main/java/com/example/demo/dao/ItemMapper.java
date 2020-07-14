package com.example.demo.dao;

import com.example.demo.pojo.entity.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    // 添加商品
    public int addItem(Item item);
}
