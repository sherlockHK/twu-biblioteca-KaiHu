package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    private static Scanner scanner= new Scanner(System.in);
    private static int choice;
    private static Library library = new Library();

    public static void main(String[] args) {
        BibliotecaApp.showMenu();

        if(choice == 1){
            showBookList();
        }else if (choice == 2){
            showReturnBooks();
        }else {
            System.out.println("Select a valid option!");
        }
    }

    private static void showBookList() {
        library.bookList();
    }

    private static void showReturnBooks() {
    }

    public static void showMenu() {
        System.out.println("********Welcome to The Bangalore Public Library!********");
        System.out.println("Main menu:");
        System.out.println("1.Checkout book");
        System.out.println("2.Return book");
        System.out.println("Please make a choice(1-2):");
        choice = scanner.nextInt();
    }
}
