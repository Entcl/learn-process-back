package com.demo3.spring5.Bean;

public class BookStore {
    private String Bs_storename_a1b2c3;

//    public void setBs_storename_a1b2c3(String bs_storename_a1b2c34) {
//        Bs_storename_a1b2c34 = bs_storename_a1b2c34;
//    }


    public void setBs_storename_a1b2c3(String bs_storename_a1b2c34) {
        Bs_storename_a1b2c3 = bs_storename_a1b2c34;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "Bs_storename_a1b2c34='" + Bs_storename_a1b2c3 + '\'' +
                '}';
    }
}
