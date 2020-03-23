package com.wolfx.springbootstudy.service;

import com.wolfx.springbootstudy.dao.TUserMapper;
import com.wolfx.springbootstudy.entity.TUser;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-22 15:37
 */
@Service
public class UserService implements ApplicationContextAware {

    @Autowired
    private TUserMapper userMapper;

    private ApplicationContext applicationContext;

    public TUser getUserById(int id){
        return Optional.ofNullable(userMapper.selectByPrimaryKey(id)).orElse(null);
    }

    public String getInitializerValue(){
        return applicationContext.getEnvironment().getProperty("key3");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
