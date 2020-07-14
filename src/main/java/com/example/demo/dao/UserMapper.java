package com.example.demo.dao;

import com.example.demo.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 添加用户
    public int addUser(User user);

}
