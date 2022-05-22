package com.demo.spring5.aop;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
//        int i = 10/0;
        System.out.println("User类中的add方法");
    }
}
