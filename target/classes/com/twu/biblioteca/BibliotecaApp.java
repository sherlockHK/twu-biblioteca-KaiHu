package com.twu.biblioteca;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.util.ConsolePrinter;
import com.twu.biblioteca.util.CustomerInput;

import java.util.ArrayList;

public class BibliotecaApp {
    private CustomerInput input;
    private static LibraryMenu menu;
    private Customer customer;
    private BookStore bookStore;
    private MovieStore movieStore;
    private ConsolePrinter consolePrinter;

    public BibliotecaApp() {
        input = new CustomerInput();
        menu = new LibraryMenu();
        customer = new Customer("KaiHu","abc@hotmail.com",123456);
        bookStore = new BookStore();
        movieStore = new MovieStore();
        consolePrinter = new ConsolePrinter();
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcome();

        while (true) {
            app.showMenu();
            int choice = app.menuChoice();
            if (app.isChoiceValid(menu.getOptions().size(), choice))
                app.handleWithChoice(choice);
        }
    }

    public void welcome(){
        consolePrinter.print("********Welcome to The Bangalore Public Library!********");
    }

    public void showMenu() {
        consolePrinter.print("Main menu:");
        consolePrinter.printList(menu.getOptions());
    }

    private int menuChoice() {
        return input.makeChoice();
    }

    private void handleWithChoice(int choice){
        int selection;
        switch (choice){
            case 1:
                showAllBooks();
                selection = input.chooseBook();
                checkoutItem(bookStore, selection);
                break;
            case 2:
                showAllMoives();
                selection = input.chooseMovie();
                checkoutItem(movieStore, selection);
                break;
            case 3:
                showLoanBooks();
                selection = input.chooseBook();
                returnBack(selection);
                break;
            case 4:
                break;
        }
    }

    private void showAllBooks(){
        consolePrinter.print("BookList:");
        consolePrinter.printList(bookStore.itemList());
    }

    private void showAllMoives(){
        consolePrinter.print("MovieList:");
        consolePrinter.printList(movieStore.itemList());
    }

    private void showLoanBooks(){
        consolePrinter.print("LoanItems:");
        consolePrinter.printList(customer.getBorrowedItems());
    }

    private void checkoutItem(ItemStore store,int choice) {
        if (isChoiceValid(store.itemsCount(),choice)){
            customer.borrowItem(store.itemList().get(choice - 1));
            store.checkoutItem(choice);
            if (store.getClass().equals(BookStore.class))
                consolePrinter.print("Thank you !Enjoy the book!");
            else if (store.getClass().equals(MovieStore.class))
                consolePrinter.print("Thank you !Enjoy the movie!");
        }
    }

    private void returnBack(int choice) {
        ArrayList<Item> items = customer.getBorrowedItems();
        if (isChoiceValid(items.size(),choice))
            if (items.get(choice-1).getClass().equals(Book.class)){
                bookStore.reserveItem(items.get(choice - 1)); //
                consolePrinter.print("Thank you for returning the book!");
            }else if (items.get(choice-1).getClass().equals(Movie.class)){
                movieStore.reserveItem(items.get(choice - 1)); //
                consolePrinter.print("Thank you for returning the movie!");
            }
            customer.returnItem(choice - 1);
    }

    private boolean isChoiceValid(int optionsCount,int choice){
        if (choice>=1 && choice < optionsCount+1){
            return true;
        }if (choice == optionsCount+1){
            consolePrinter.print("System Exit!");
            System.exit(0);
            return false;
        }else {
            consolePrinter.print("Select a valid option!");
            return false;
        }
    }


}
