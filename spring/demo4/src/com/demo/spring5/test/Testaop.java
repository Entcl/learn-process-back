package com.demo.spring5.test;

import com.demo.spring5.aop.User;
import org.junit.Test;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaop {


    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        user.add();

    }
}
