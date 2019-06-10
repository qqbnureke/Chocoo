package com.nurda.chocotask.model;

public class Book implements Comparable<Book>{
    private String name;
    private int pageCount;
    private int price;

    public Book(String name, int pageCount, int price) {
        this.name = name;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book book2) {
        return getPageCount()-book2.getPageCount();
    }
}
