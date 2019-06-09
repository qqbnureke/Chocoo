package com.nurda.chocotask.model;

import java.util.ArrayList;
import java.util.Collections;

public class DBRepository implements IBookRepository {
    ArrayList<Book> bookList;

    public DBRepository() {
        bookList = new ArrayList<>();
    }

    @Override
    public boolean addBook(Book book) {
        bookList.add(book);
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        bookList.remove(book);
        return false;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        Collections.sort(bookList);
        return bookList;
    }


}
