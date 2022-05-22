package com.demo2.spring5;

public class User {
    public String uname;
    public Integer usex;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUsex(Integer usex) {
        this.usex = usex;
    }

    public void outUserAtt(){
        System.out.println("uname:"+uname+" usex:"+usex);
    }

    public void add(){
        System.out.println("addd");
    }


}
