package com.demo.spring5.autowire;

public class Dept {

//    @Override
//    public String toString() {
//        return "Dept{}";
//    }
    @Override
    public String toString() {
        return "Dept{" +
                "deptname='" + deptname + '\'' +
                '}';
    }
    public String deptname;

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }


}
