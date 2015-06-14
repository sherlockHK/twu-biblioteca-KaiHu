package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/11.
 */
public class BookStore extends ItemStore {

    public BookStore() {
        super(new ArrayList<Book>());
    }

    public void dataInit() {
        Book book_one = new Book("The Hobbit","J.R.R.Tolkien","2011");
        Book book_two = new Book("To Kill a Mockingbird","Harper Lee","1988");
        Book book_three = new Book("Eat, Pray, Love","Elizabeth Gilbert","2010");
        Book book_four = new Book("The Kite Runner ","Khaled Hosseini ","2013");
        Book book_five = new Book("The Lord of the Rings","J.R.R.Tolkien","2007");

        itemList.add(book_one);
        itemList.add(book_two);
        itemList.add(book_three);
        itemList.add(book_four);
        itemList.add(book_five);
    }
//
//    @Override
//    public List<Item> itemList(){
//        return itemList;
//    }

//    public ArrayList<Book> allBookList() {
//        return bookList;
//    }
//
//    public void checkoutBook(int choice) {
//        bookList.remove(choice-1);
//    }
//
//    public int bookCount(){
//        return bookList.size();
//    }
//
//    public void reserveBook(Book book) {
//        bookList.add(book);
//    }
}
