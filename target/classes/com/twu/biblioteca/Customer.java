package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/4.
 */
public class Customer {
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
//    private Scanner scanner = new Scanner(System.in);
//    private int choice;

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowedBookList() {
        System.out.println("********customer booklist********");
        for(Book book : borrowedBooks){
            System.out.println(borrowedBooks.indexOf(book)+1+"."+book.bookInfo());
        }
        System.out.println(borrowedBooks.size()+1+"."+"Quit!");
        System.out.println("Please make a choice(1-"+borrowedBooks.size()+"):");
//        choice = scanner.nextInt();
    }

    public void checkoutBooks(Book book){
        borrowedBooks.add(book);
    }

    public void returnBooks(int choice){
        borrowedBooks.remove(choice);
    }


}
