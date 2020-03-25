package com.wolfx.springbootstudy;

import com.wolfx.springbootstudy.listener.SecondApplicationListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wolfx.springbootstudy.dao")
public class SpringBootStudyApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootStudyApplication.class, args);

        SpringApplication springApplication = new SpringApplication(SpringBootStudyApplication.class);
        //手动注册监听器
        springApplication.addListeners(new SecondApplicationListener());
        springApplication.run(args);
    }

}
