package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {
    private  CustomerInput input;
    private static LibraryMenu menu;
    private BookStore bookStore;

    public BibliotecaApp() {
        input = new CustomerInput();
        menu = new LibraryMenu();
        bookStore = new BookStore();
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();

        app.welcome();
        app.showMenu();

        int choice = app.customerChoice();
        if (app.isChoiceValid(menu.getOptions().size(), choice))
            app.handleWithChoice(choice);
    }

    public void welcome(){
        System.out.println("********Welcome to The Bangalore Public Library!********");
    }

    public void showMenu() {
        System.out.println("Main menu:");
        printMessage(menu.getOptions());
    }

    private int customerChoice() {
        return input.makeChoice();
    }

    private void handleWithChoice(int choice){
        switch (choice){
            case 1:
               //checkoutBook
                showAllBooks();
                int bookSelect = customerChoice();
                checkoutBook(bookSelect);
                break;
            case 2:
                //returnBooks
                break;
        }
    }

    private void checkoutBook(int choice) {
        if (isChoiceValid(bookStore.bookCount(),choice))
            bookStore.checkoutBook(choice);
        showAllBooks();
    }

    private boolean isChoiceValid(int optionsCount,int choice){
        if (choice>=1 && choice < optionsCount+1){
            return true;
        }if (choice == optionsCount+1){
            showMenu();
            System.out.println("Return to menu!");
            return false;
        }else {
            System.out.println("Select a valid option!");
            return false;
        }
    }

    private void showAllBooks(){
        System.out.println("BookList:");
        printMessage(bookStore.allBookList());
    }

    private void printMessage(List list){
        String printString = "";
        for (int i = 1; i <= list.size(); i++) {
            printString += i+"."+list.get(i-1) +"\n";

            //add a quit option
            if (i==list.size())
                printString += (i+1)+"."+"Quit!";
        }
        System.out.println(printString);
    }





}
