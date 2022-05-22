package com.demo.spring5.dao.impl;

import com.demo.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("userDaoImpl2")
public class UserDaoImpl2 implements UserDao {

    @Override
    public void test() {
        System.out.println("UserDao接口的实现类UserDaoImpl2");
    }
}
