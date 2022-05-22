package com.demo.spring5.test;

import com.demo.spring5.config.SubstituteBean;
import com.demo.spring5.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserServices userServices = context.getBean("userServices", UserServices.class);
        userServices.test();

    }

    @org.junit.Test
    public void test2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SubstituteBean.class);

        UserServices userServices = context.getBean("userServices", UserServices.class);
        userServices.test();

    }
}
