package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/11.
 */
public class BookStore {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public BookStore() {
        bookStoreInit();
    }

    private void bookStoreInit() {
        Book book_one = new Book("The Hobbit","J.R.R.Tolkien","2011");
        Book book_two = new Book("To Kill a Mockingbird","Harper Lee","1988");
        Book book_three = new Book("Eat, Pray, Love","Elizabeth Gilbert","2010");
        Book book_four = new Book("The Kite Runner ","Khaled Hosseini ","2013");
        Book book_five = new Book("The Lord of the Rings","J.R.R.Tolkien","2007");

        bookList.add(book_one);
        bookList.add(book_two);
        bookList.add(book_three);
        bookList.add(book_four);
        bookList.add(book_five);
    }

    public ArrayList<Book> allBookList() {
        return bookList;
    }

    public void checkoutBook(int choice) {
        bookList.remove(choice-1);
    }

    public int bookCount(){
        return bookList.size();
    }
}
