package com.demo3.spring5.Bean;

public class Employee {
    private String ename;
    private String egender;

    private Depart depart;

    public void setDepart(Depart depart) {
        this.depart = depart;
    }
    //    public void setDep(Depart depart) {
//        this.depart = depart;
//    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEgender(String egender) {
        this.egender = egender;
    }

    public void add() {
        System.out.println("-------------Employee-------------");
        System.out.println("ename:" + ename + "egender:" + egender + depart);
    }
}
