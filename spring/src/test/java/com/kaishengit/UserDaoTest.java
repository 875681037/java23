package com.kaishengit;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class UserDaoTest{


        @Test
        public void save(){
            ApplicationContext appletcationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            UserDao userDao = (UserDao) appletcationContext.getBean("userDao");


        }



    }