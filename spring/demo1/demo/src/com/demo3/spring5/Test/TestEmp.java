package com.demo3.spring5.Test;

import com.demo2.spring5.Service.UserService;
import com.demo3.spring5.Bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestEmp {


    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Employee employee = context.getBean("employee", Employee.class);
        employee.add();
    }

    @Test
    public void test2(){
        int a = 10;
        System.out.println("a = " + a);

    }

//    @Test
//    public  void test3(){
//        Personaaa p1 =new Personaaa();
//        System.out.println(p1);
//
//    }

}
//class Personaaa{
//    public Personaaa(){
//        System.out.println("hahahahahaha");
//    }
//    public static  void Main(){
//
//    }
//}