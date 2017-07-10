package com.kaishengit.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 875681037 on 2017/7/8.
 */
public class UserServiceTest {

    @Test
    public void save(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ctx.getBean("userService");
        userService.save();
    }
}
