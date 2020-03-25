package com.wolfx.springbootstudy.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-25 9:18
 */
@Order(3)
public class ThirdApplicationListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("ThirdApplicationListener执行...");
    }
}
