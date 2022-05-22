package com.demo3.spring5.Bean;

public class Depart {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
