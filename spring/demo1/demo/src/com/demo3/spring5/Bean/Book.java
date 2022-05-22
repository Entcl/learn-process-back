package com.demo3.spring5.Bean;

public class Book {
    private String bookName;
    private Double bookPrice;

    private BookStore bookStore;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public BookStore getBookStore() {
        return bookStore;
    }

    public void outStoreName() {

        System.out.println("bookName:"+bookName+"bookPrice: "+bookPrice+" "+bookStore);
    }
}
