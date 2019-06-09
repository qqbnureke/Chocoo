package com.nurda.chocotask.model;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.price - book2.price;
    }

}

//    public static Comparator<Book> bookNameComparator = new Comparator<Book>() {
//        @Override
//        public int compare(Book book1, Book book2) {
//            String mBook1 = book1.getName();
//            String mBook2 = book2.getName();
//            return mBook1.compareTo(mBook2);
//        }
//    };
//
//    public static Comparator<Book> bookPageComparator = new Comparator<Book>() {
//        @Override
//        public int compare(Book book1, Book book2) {
//            int mBook1 = book1.getPagesCount();
//            int mBook2 = book2.getPagesCount();
//            return mBook1-mBook2;
//        }
//    };
//
//    public static Comparator<Book> bookPriceComparator = new Comparator<Book>() {
//        @Override
//        public int compare(Book book1, Book book2) {
//            int mBook1 = book1.getPrice();
//            int mBook2 = book2.getPrice();
//            return mBook1-mBook2;
//        }
//    };

