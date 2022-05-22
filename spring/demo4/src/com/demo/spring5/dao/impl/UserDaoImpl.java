package com.demo.spring5.dao.impl;

import com.demo.spring5.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
//        System.out.println("-----2:add执行");
        System.out.println("add excute执行");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("------3:update执行");
        return id;
    }
}
