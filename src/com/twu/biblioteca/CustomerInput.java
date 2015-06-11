package com.twu.biblioteca;

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
        int choice = scanner.nextInt();
        return choice;
    }
}
