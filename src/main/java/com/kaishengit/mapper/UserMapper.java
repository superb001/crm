package com.kaishengit.mapper;

import com.kaishengit.pojo.User;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
public interface UserMapper {
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}

