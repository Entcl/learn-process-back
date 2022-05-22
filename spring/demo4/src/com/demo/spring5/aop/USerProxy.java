package com.demo.spring5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强代理
@Component
@Aspect
//@Order(1)数字越小越优先
public class USerProxy {

//    增强通知
    @Before(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void beforeAdd(){
        System.out.println("在USerProxy中的beforeAdd方法");
    }

    @After(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void afterAdd(){
        System.out.println("在USerProxy中的afterAdd方法");
    }

//    异常通知
    @AfterThrowing(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void afterThrowing(){
        System.out.println("在USerProxy中的afterThrowing方法");
    }

    @Around(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void around  (ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around menthods before ");
        proceedingJoinPoint.proceed();
        System.out.println("around menthods after  ");
    }

}
