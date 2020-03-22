package com.wolfx.springbootstudy.controller;

import com.wolfx.springbootstudy.entity.TUser;
import com.wolfx.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-22 15:56
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello/{id}")
    @ResponseBody
    public String getUserById(@PathVariable(value = "id") int id){
        return Optional.ofNullable(userService.getUserById(id)).map(TUser::toString).orElse("emty string");
    }
}
