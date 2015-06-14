package com.twu.biblioteca.util;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/11.
 */
public class CustomerInput {
    private Scanner scanner;

    public CustomerInput() {
        this.scanner = new Scanner(System.in);
    }

    public int makeChoice() {
        System.out.println("Please enter your choice:");
        return chooseNum();
    }

    public int chooseBook(){
        System.out.println("Select a book with index:");
        return chooseNum();
    }

    private int chooseNum() {
        int choice = scanner.nextInt();
        return choice;
    }

    public int chooseMovie(){
        System.out.println("Select a book with index:");
        return chooseNum();
    }
}