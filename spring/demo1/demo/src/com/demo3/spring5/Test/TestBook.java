package com.demo3.spring5.Test;

import com.demo3.spring5.Bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void Test1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean4.xml");

        Book book =context.getBean("book",Book.class);
//        System.out.println(book);
        book.outStoreName();
    }

}
