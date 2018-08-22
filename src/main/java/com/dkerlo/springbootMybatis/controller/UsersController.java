package com.dkerlo.springbootMybatis.controller;

import com.dkerlo.springbootMybatis.entity.Users;
import com.dkerlo.springbootMybatis.service.IUsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UsersController {

    @Resource
    IUsersService usersService;

    @GetMapping("/finduser")
    public String getUserName(long id)
    {
        Users user= usersService.getTheUser(id);

        if(user != null)
            return  user.getUname();
        else
            return "没有想要记录!";
    }
}
