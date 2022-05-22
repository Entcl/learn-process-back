package com.demo.spring5.services;

import com.demo.spring5.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service("userServices")
public class UserServices {

//    @Resource(1.8)
//    <pro name value
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;



    public void test(){
        System.out.println("userServices类中的test方法");
        userDao.test();
    }
}
