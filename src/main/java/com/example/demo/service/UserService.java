package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.dto.LoginUser;
import com.example.demo.user.User;

public interface UserService extends IService<User> {
    //确定返回值
    boolean loginCheck(LoginUser loginUser);
}