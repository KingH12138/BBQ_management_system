package com.hqyj.bbq.demo.user.service;

import com.hqyj.bbq.demo.user.dto.LoginUser;
import com.hqyj.bbq.demo.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jhb
 * @since 2023-10-28
 */
public interface UserService extends IService<User> {
    //确定返回值
    boolean loginCheck(LoginUser loginUser);
}
