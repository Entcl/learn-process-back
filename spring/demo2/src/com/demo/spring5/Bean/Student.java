package com.demo.spring5.Bean;

public class Student {
    private String sname;

    public void setSname(String sname) {
        this.sname = sname;
        System.out.println("2.调用了Student类的setSname");
    }

//    无参构造


    public Student() {
        System.out.println("1.调用了Student类的无参构造");
    }

    public void initStudent() {
        System.out.println("3.调用了Student类的initStudent");

    }

    public void destoryStudent() {
        System.out.println("5.调用了Student类的destoryStudent");

    }
}
