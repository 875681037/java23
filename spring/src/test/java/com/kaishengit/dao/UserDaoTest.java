package com.kaishengit.dao;


import com.kaishengit.service.DiDemo;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void save() {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        DiDemo diDemo = (DiDemo) ctx.getBean("diDemo");
        diDemo.show();

        ctx.close();



    }

}
