package com.wolfx.springbootstudy.service;

import com.wolfx.springbootstudy.dao.TUserMapper;
import com.wolfx.springbootstudy.entity.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-22 15:37
 */
@Service
public class UserService {

    @Autowired
    private TUserMapper userMapper;

    public TUser getUserById(int id){
        return Optional.ofNullable(userMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
