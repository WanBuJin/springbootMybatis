package com.dkerlo.springbootMybatis.service;

import com.dkerlo.springbootMybatis.entity.Users;

public interface IUsersService {


    /**
     * 获取单个用户信息
     * @param id
     * @return
     */
    public Users getTheUser(long id);
}
