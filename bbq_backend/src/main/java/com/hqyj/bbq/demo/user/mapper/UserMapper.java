package com.hqyj.bbq.demo.user.mapper;

import com.hqyj.bbq.demo.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jhb
 * @since 2023-10-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> show_all_users();
}
