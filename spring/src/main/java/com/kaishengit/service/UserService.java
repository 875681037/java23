package com.kaishengit.service;

import com.kaishengit.dao.UserDao;
import com.kaishengit.dao.WeixinDao;

/**
 * Created by 875681037 on 2017/7/7.
 */
public class UserService {
    private UserDao userDao;
    private WeixinDao weixinDao;
    public UserService(UserDao userDao,WeixinDao weixinDao){
        this.userDao=userDao;
        this.weixinDao=weixinDao;
    }
    public void save(){
        userDao.save();
    }

}
