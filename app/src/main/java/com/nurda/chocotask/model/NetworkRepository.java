package com.nurda.chocotask.model;

import com.nurda.chocotask.util.NetworkException;

import java.util.ArrayList;
import java.util.Collections;

public class NetworkRepository implements INetworkRepository{

    ArrayList<Book> booksList = new ArrayList<>();
    DBRepository dbRepository;

    @Override
    public void makeAPIrequest() throws NetworkException {
        int rand_num = (int) (Math.random()*2);

        if (rand_num == 0){
            throw new NetworkException();
        }else{
            booksList.add(new Book("Гарри Поттер", 561, 23));
            booksList.add(new Book("Война и Мир", 445, 16));
            booksList.add(new Book("Анна Каренина  ", 775, 18));
        }
    }

    @Override
    public void DBrequest() {
        dbRepository = new DBRepository();

        dbRepository.addBook(new Book("Игра престолов", 465, 30));
        dbRepository.addBook(new Book("Чужак", 651, 24));
        dbRepository.addBook(new Book("Шантарам", 505, 17));
        dbRepository.addBook(new Book("Богатый папа, бедный папа", 561, 23));
        dbRepository.addBook(new Book("Побег из Шоушенка", 445, 31));


    }

    @Override
    public ArrayList<Book> getBooks() {
        booksList.clear();

        try {
            makeAPIrequest();
            Collections.sort(booksList, new BookPriceComparator());
        }catch (NetworkException ex){
            DBrequest();
            booksList = dbRepository.getAllBooks();
        }

        return booksList;
    }



}
