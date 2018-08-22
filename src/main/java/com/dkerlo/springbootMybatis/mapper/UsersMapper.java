package com.dkerlo.springbootMybatis.mapper;

import com.dkerlo.springbootMybatis.entity.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    Users selectByPrimaryKey(Long id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}