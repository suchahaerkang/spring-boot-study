package com.wolfx.springbootstudy.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-22 20:34
 */
@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //从容器中获取环境变量组件
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //自己自定义一些属性放在map集合中
        Map<String, Object> map = new HashMap<>();
        map.put("key3", "value3");
        //包装为MapPropertySource组件
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitializer", map);
        //存到环境变量中去
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("ThirdInitializer属性注册成功...");
    }
}
