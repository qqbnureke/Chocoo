package com.nurda.chocotask.model;

import com.nurda.chocotask.util.NetworkException;

import java.util.ArrayList;

public interface INetworkRepository {

    void makeAPIrequest() throws NetworkException;
    void DBrequest();
    ArrayList<Book> getBooks();
}
