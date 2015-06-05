package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/3.
 */
public class Library {
    ArrayList<Book> bookList = new ArrayList<Book>();

    public Library() {
        Book book_one = new Book(1,"The Hobbit","J.R.R.Tolkien","2011");
        Book book_two = new Book(2,"To Kill a Mockingbird","Harper Lee","1988");
        Book book_three = new Book(3,"Eat, Pray, Love","Elizabeth Gilbert","2010");
        Book book_four = new Book(4,"The Kite Runner ","Khaled Hosseini ","2013");
        Book book_five = new Book(5,"The Lord of the Rings","J.R.R.Tolkien","2007");

        bookList.add(book_one);
        bookList.add(book_two);
        bookList.add(book_three);
        bookList.add(book_four);
        bookList.add(book_five);
    }

    public void bookList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("********biblioteca booklist********");
        for (Book book : bookList){
            System.out.println(book.getId()+"."+book.getName()+"  "+book.getAuthor()+"  "+book.getPublishedYear());
        }
        System.out.println("Please make a choice(1-"+bookList.size()+"):");
        int choice = scanner.nextInt();
    }



}
