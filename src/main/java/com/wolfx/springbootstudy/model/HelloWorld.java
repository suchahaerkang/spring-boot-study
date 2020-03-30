package com.wolfx.springbootstudy.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-30 10:29
 */
public class HelloWorld {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}
