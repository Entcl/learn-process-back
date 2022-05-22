package com.demo.spring5.testdemo;

import com.demo.spring5.Orders;
import com.demo.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDemo {

    @Test
    public void testAdd() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);


        System.out.println(user);
        user.add();

    }

    @Test
    public void testUserBean(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.outUserAtt();
    }

    @Test
    public void testOrdersBean(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.outOrdersAtt();
    }
}
