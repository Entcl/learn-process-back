package com.demo.spring5.dao.impl;

import com.demo.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Value(value = "UserDao接口的实现类UserDaoImpl中的name属性")
    private String name;

    @Override
    public void test() {
//        System.out.println("UserDao接口的实现类UserDaoImpl");
        System.out.println("UserDao接口的实现类UserDaoImpl----------"+name);
    }
}
