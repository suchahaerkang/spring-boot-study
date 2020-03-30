package com.wolfx.springbootstudy.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-27 16:48
 */
@Data
@Component
public class Dog {
    private String name;

    private String age;
}
