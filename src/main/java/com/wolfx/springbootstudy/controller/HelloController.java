package com.wolfx.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @description:
 * @author: sukang
 * @date: 2020-04-02 13:46
 */
@Controller
public class HelloController {

    @GetMapping(value = "/success")
    public String hello(Map<String, Object> map){
        map.put("hello", "hello world");
        return "success";
    }
}
