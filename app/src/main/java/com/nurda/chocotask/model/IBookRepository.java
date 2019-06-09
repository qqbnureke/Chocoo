package com.nurda.chocotask.model;

import java.util.ArrayList;

public interface IBookRepository {
    boolean addBook(Book book);
    boolean deleteBook(Book book);
    ArrayList<Book> getAllBooks();
}
