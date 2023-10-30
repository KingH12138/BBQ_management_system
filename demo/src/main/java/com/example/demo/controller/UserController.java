 package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.LoginUser;
import com.example.demo.service.UserService;
import com.example.demo.user.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired //注入其他类的注解
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @GetMapping("/user/delete")
    //删除用户
    public Integer delete(@RequestBody User user){
        return userMapper.delete_user(user);
    }
    @PostMapping("/user/update")
    //更新用户信息
    public Integer update(@RequestBody User user){    //RequestBody把前端输入的json对象转换为User对象
        return userMapper.update_user(user);
    }
    @PostMapping("/user/register")
    //插入用户
    public Integer insert(@RequestBody User user){    //RequestBody把前端输入的json对象转换为User对象
        return userMapper.insert_user(user);
    }
    //展示全部的用户数据
    @RequestMapping("/user")//之后必须在url后面加上user才能访问
    public List<User> findall (){
        return userMapper.show_all_users();
    }
    @RequestMapping("/login")
    public JSONObject login_check(@RequestBody LoginUser loginUser){
        //System.out.println(loginUser.getUsername());
        //调用service层方法
        boolean flag = userService.loginCheck(loginUser);
        JSONObject obj = new JSONObject();
        if(flag){
            obj.put("code",200);
            obj.put("msg","操作成功");
            obj.put("userInfo",loginUser);
        }else {
            obj.put("code",-1);
            obj.put("msg","操作失败");
        }
        return obj;
    }
}