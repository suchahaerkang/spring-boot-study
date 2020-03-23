package com.wolfx.springbootstudy;

import com.wolfx.springbootstudy.initializer.SecondInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wolfx.springbootstudy.dao")
public class SpringBootStudyApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootStudyApplication.class, args);

        SpringApplication springApplication = new SpringApplication(SpringBootStudyApplication.class);
        //手动注册初始化器
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }

}
