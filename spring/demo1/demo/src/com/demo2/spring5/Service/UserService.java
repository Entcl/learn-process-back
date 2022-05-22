package com.demo2.spring5.Service;


import com.demo2.spring5.Dao.UserDao;

public class UserService {

    //外部注入(set)
    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add() {
        System.out.println("------------UserService-------");

        //多态
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();

        userDao.update();


    }
}
