package com.twu.biblioteca;

import com.twu.biblioteca.model.Item;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/4.
 */
public class Customer implements BorrowingAuthority,DisplayInformationAuhority,CustomerLogin {
    private String name;
    private String emailAdress;
    private int phoneNumber;
    private int libraryNumber;
    private String password;

    private ArrayList<Item> borrowedItems;

    public Customer(String name,String emailAdress,int phoneNumber) {
        this.name = name;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<Item>();
        this.libraryNumber = 123;
        this.password = "abc";
    }

    @Override
    public ArrayList<Item> getBorrowedItems() {return borrowedItems;}

    @Override
    public void borrowItem(Item book) {
        borrowedItems.add(book);
    }

    @Override
    public void returnItem(int choice) {
        borrowedItems.remove(choice);
    }

    @Override
    public String customerInformation(){
        return "************Customer Information************"+
                "Name:"+this.name+"\n"+"Email:"+this.emailAdress+"\n"+"PhoneNumber:"+this.phoneNumber;
    }

    @Override
    public boolean loginAuthenticate(int libraryNumber,String password){
        return this.libraryNumber == libraryNumber && this.password.equals(password);
    }
}
