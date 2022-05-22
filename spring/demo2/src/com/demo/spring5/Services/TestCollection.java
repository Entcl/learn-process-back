package com.demo.spring5.Services;

import com.demo.spring5.Bean.Student;
import com.demo.spring5.autowire.Emp;
import com.demo.spring5.collectionType.Abc;
import com.demo.spring5.collectionType.Book;
import com.demo.spring5.collectionType.Course;
import com.demo.spring5.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestCollection {

    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Abc abc = context.getBean("string", Abc.class);
        abc.add();
    }

    @Test
    public void test2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        book.test();
    }


    @Test
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        Course abc = context.getBean("myBean", Course.class);
        System.out.println(abc);
    }

    @Test
    public void testSingleTon() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2-1.xml");

        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

//        singleton
//        com.demo.spring5.collectionType.Book@2002fc1d
//        com.demo.spring5.collectionType.Book@2002fc1d

//        prototype
//        com.demo.spring5.collectionType.Book@3d34d211
//        com.demo.spring5.collectionType.Book@7dc0f706
        System.out.println(book);
        System.out.println(book2);
    }

    @Test
    public void test4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("bean4.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println("4.获取通过bean创建的student");
        System.
                out.println(student);

        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void test5(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp =context.getBean("emp",Emp.class);
        System.out.println(emp);
        emp.test();
    }
//    @Test
//    public void test2(){
//        System.out.println("sortTest");
//        int[] arr={6,3,8,2,9,1};
//        System.out.println(Arrays.toString(arr));
//        System.out.println("-------------");
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=0;j<arr.length-1-i;j++){
//                int temp = 0;
//                if (arr[j]>arr[j+1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

}
