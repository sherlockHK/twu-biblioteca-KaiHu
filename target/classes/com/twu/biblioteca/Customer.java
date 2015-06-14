package com.twu.biblioteca;

import com.twu.biblioteca.model.Item;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/4.
 */
public class Customer {
    private ArrayList<Item> borrowedBooks;

    public Customer() {
        this.borrowedBooks = new ArrayList<Item>();
    }

    public ArrayList<Item> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Item book){
        borrowedBooks.add(book);
    }

    public void returnBook(int choice){
        borrowedBooks.remove(choice);
    }


}
