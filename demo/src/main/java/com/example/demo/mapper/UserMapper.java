package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository //把usermap注入到bean中
public interface UserMapper extends BaseMapper<User> {   //数据库的接口，专门用于数据库的交互
    List<User> show_all_users();

    int insert_user(User user);

    int update_user(User user);

    int delete_user(User user);
}
