package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/4.
 */
public class Customer {
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(int choice){
        borrowedBooks.remove(choice);
    }


}
