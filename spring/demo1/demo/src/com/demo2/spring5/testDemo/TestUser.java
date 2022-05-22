package com.demo2.spring5.testDemo;

import com.demo2.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {


    @Test
    public void TestBean2UserInject(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userServies =context.getBean("userServies",UserService.class);
        System.out.println("-------------TestBean2UserInject----------");
        userServies.add();
    }
}
