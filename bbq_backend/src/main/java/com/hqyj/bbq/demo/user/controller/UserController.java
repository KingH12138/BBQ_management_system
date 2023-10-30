package com.hqyj.bbq.demo.user.controller;


import com.alibaba.fastjson.JSONObject;
import com.hqyj.bbq.demo.user.dto.LoginUser;
import com.hqyj.bbq.demo.user.entity.User;
import com.hqyj.bbq.demo.user.mapper.UserMapper;
import com.hqyj.bbq.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jhb
 * @since 2023-10-28
 */
@RestController

public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    //登录
    @PostMapping("/loginCheck")
    public JSONObject loginCheck(@RequestBody LoginUser loginUser){
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
    @RequestMapping("/user")
    public List<User> index(){
        return userMapper.show_all_users();
    }
}