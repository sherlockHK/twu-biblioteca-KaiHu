package com.twu.biblioteca;

public class BibliotecaApp {
//    private static Scanner scanner= new Scanner(System.in);
//    private static int choice ;
//    private static Library library = new Library();
    private static CustomerInput input;
    private static LibraryMenu menu;

    public BibliotecaApp() {
        input = new CustomerInput();
        menu = new LibraryMenu();
    }


    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();

        app.welcome();
        app.showMenu();

        int choice = app.customerChoice();
        app.handleWithChoice(choice);
    }

    public void welcome(){
        System.out.print("********Welcome to The Bangalore Public Library!********");
    }
    public void showMenu() {
        System.out.println(menu);
    }

    private int customerChoice() {
        return input.makeChoice();
    }

    private void handleWithChoice(int choice){
        switch (choice){
            case 1:
                //showAllBooks;
                break;
            case 2:
                //checkoutBook
                break;
            case 3:
                //returnBooks
                break;
            case 4:
                System.exit(0);
            default:
                System.out.print("That is a invalid option");
        }
    }





}
