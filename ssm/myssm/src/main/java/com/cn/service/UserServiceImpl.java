package com.cn.service;

import com.cn.mapper.UserMapper;
import com.cn.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserAll() {
       return userMapper.findAll();
    }
}
