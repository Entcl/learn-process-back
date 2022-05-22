package com.demo.spring5;

public class Orders {
    public String oname;
    public String oaddress;
    public String ojoke;
    public String ohaha;

    public Orders(String name, String address,String joke,String haha) {
        this.oname = name;
        this.oaddress = address;
        this.ojoke = joke;
        this.ohaha= haha;
    }

    public void outOrdersAtt() {
        System.out.println("oname:" + oname + " oaddress:" + oaddress+"ojoke:"+ojoke+"ohaha:"+ohaha);
    }
}
