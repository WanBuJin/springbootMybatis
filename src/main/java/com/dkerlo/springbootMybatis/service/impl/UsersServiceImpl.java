package com.dkerlo.springbootMybatis.service.impl;

import com.dkerlo.springbootMybatis.entity.Users;
import com.dkerlo.springbootMybatis.mapper.UsersMapper;
import com.dkerlo.springbootMybatis.service.IUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UsersService")
public class UsersServiceImpl implements IUsersService {

    @Resource
    UsersMapper usersDao;

    public Users getTheUser(long id) {
        return usersDao.selectByPrimaryKey(id);
    }
}
