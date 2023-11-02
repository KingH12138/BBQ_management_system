package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dto.LoginUser;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.user.User;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean loginCheck(LoginUser loginUser) {
        //增加了一个借口 可以用来解决单表的增删改查
        QueryWrapper<User> w = new QueryWrapper<>();
        w.eq("username",loginUser.getUsername());
        w.eq("password",loginUser.getPassword());
        User user = this.getOne(w);
        if(ObjectUtils.isEmpty(user)){
            return false;
        }else {
            return true;
        }

    }
}