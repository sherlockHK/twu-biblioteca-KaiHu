package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/3.
 */
public class Library {
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private Scanner scanner = new Scanner(System.in);
    private int choice;
    private Customer customer = new Customer();

    public Library() {
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

    public void bookList(){
        showBookList();      //print booklist
        makeCheckoutChoice(choice);
    }

    private void showBookList() {
        System.out.println("********biblioteca booklist********");
        for (Book book : bookList){
            System.out.println(bookList.indexOf(book)+1+"."+book.bookInfo());
        }
        System.out.println(bookList.size()+1+"."+"Quit!");
        System.out.println("Please make a choice(1-"+bookList.size()+"):");
        choice = scanner.nextInt();
    }

    private void makeCheckoutChoice(int choice) {
        //choose Quit!
        if (choice == bookList.size()+1){
//            BibliotecaApp.showMenu();
//            BibliotecaApp.makeChoice();
        }
        //choose book
        else {
            checkoutBook(choice);
        }
    }

    private int checkoutBook(int choice) {
        if (choice != 0 && choice <=bookList.size()){
            customer.checkoutBooks(bookList.get(choice-1));
            bookList.remove(choice-1);
            System.out.println("Thank you!Enjoy the book!");
        }else {
            System.out.println("That book is not available");
        }
        bookList();
        return bookList.size();
    }

    public void borrowedBookList(){
        showBorrowedBookList();
        makeReturnBookChoice();
    }

    private void showBorrowedBookList(){
        customer.borrowedBookList();
        choice = scanner.nextInt();
    }

    private void makeReturnBookChoice() {
        //choose Quit!
        if (choice == customer.getBorrowedBooks().size()+1){
//            BibliotecaApp.showMenu();
//            BibliotecaApp.makeChoice();
        }
        //return book
        else {
            returnBook(choice);
        }
    }

    private int returnBook(int choice) {
        ArrayList<Book> borrwoedBooks = customer.getBorrowedBooks();
        if (choice != 0 && choice <=borrwoedBooks.size()){
            bookList.add(borrwoedBooks.get(choice-1));
            customer.returnBooks(choice-1);
            System.out.println("Thank you for returning the book.");
        }else {
            System.out.println("That is not a valid book to return.");
        }
        borrowedBookList();
        return borrwoedBooks.size();
    }
}
