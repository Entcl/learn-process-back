package com.demo.spring5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//��ǿ����
@Component
@Aspect
//@Order(1)����ԽСԽ����
public class USerProxy {

//    ��ǿ֪ͨ
    @Before(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void beforeAdd(){
        System.out.println("��USerProxy�е�beforeAdd����");
    }

    @After(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void afterAdd(){
        System.out.println("��USerProxy�е�afterAdd����");
    }

//    �쳣֪ͨ
    @AfterThrowing(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void afterThrowing(){
        System.out.println("��USerProxy�е�afterThrowing����");
    }

    @Around(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void around  (ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around menthods before ");
        proceedingJoinPoint.proceed();
        System.out.println("around menthods after  ");
    }

}
