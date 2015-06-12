package com.twu.biblioteca;

public class BibliotecaApp {
    private  CustomerInput input;
    private static LibraryMenu menu;
    private Customer customer;
    private BookStore bookStore;
    private ConsolePrinter consolePrinter;

    public BibliotecaApp() {
        input = new CustomerInput();
        menu = new LibraryMenu();
        customer = new Customer();
        bookStore = new BookStore();
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
        System.out.println("********Welcome to The Bangalore Public Library!********");
    }

    public void showMenu() {
        consolePrinter.print("Main menu:");
        consolePrinter.printList(menu.getOptions());
    }

    private int menuChoice() {
        return input.makeChoice();
    }

    private int bookChoice(){
        return input.chooseBook();
    }

    private void handleWithChoice(int choice){
        int bookSelect;
        switch (choice){
            case 1:
                showAllBooks();
                bookSelect = bookChoice();
                checkoutBook(bookSelect);
                break;
            case 2:
                showLoanBooks();
                bookSelect = bookChoice();
                returnBookToBookStore(bookSelect);
                break;
        }
    }

    private void showAllBooks(){
        consolePrinter.print("BookList:");
        consolePrinter.printList(bookStore.allBookList());
    }

    private void showLoanBooks(){
        consolePrinter.print("LoanBooks:");
        consolePrinter.printList(customer.getBorrowedBooks());
    }

    private void checkoutBook(int choice) {
        if (isChoiceValid(bookStore.bookCount(),choice)){
            customer.borrowBook(bookStore.allBookList().get(choice - 1));
            bookStore.checkoutBook(choice);
            consolePrinter.print("Thank you !Enjoy the book!");
        }
    }

    private void returnBookToBookStore(int choice) {
        if (isChoiceValid(customer.getBorrowedBooks().size(),choice)){
            customer.returnBook(choice - 1);
            bookStore.reserveBook(bookStore.allBookList().get(choice - 1));
            consolePrinter.print("Thank you for returning the book!");
        }
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
