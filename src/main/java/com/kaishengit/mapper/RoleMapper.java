package com.kaishengit.mapper;

import com.kaishengit.pojo.Role;

import java.util.List;

/**
 * Created by Administrator on 2017/3/21 0021.
 */
public interface RoleMapper {
    /**
     * 根据用户ID查找具有的角色列表
     * @param userId
     * @return
     */
    List<Role> findByUserId(Integer userId);
}
