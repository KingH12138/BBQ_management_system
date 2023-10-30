package com.hqyj.bbq.demo.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hqyj.bbq.demo.user.dto.LoginUser;
import com.hqyj.bbq.demo.user.entity.User;
import com.hqyj.bbq.demo.user.mapper.UserMapper;
import com.hqyj.bbq.demo.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jhb
 * @since 2023-10-28
 */
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
