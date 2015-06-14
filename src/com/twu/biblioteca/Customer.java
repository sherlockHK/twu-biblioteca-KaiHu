package com.twu.biblioteca;

import com.twu.biblioteca.model.Item;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/4.
 */
public class Customer implements BorrowingAuthority,DisplayInformationAuhority {
    String name;
    String emailAdress;
    int phoneNumber;

    private ArrayList<Item> borrowedItems;

    public Customer() {
        this.borrowedItems = new ArrayList<Item>();
    }

    @Override
    public ArrayList<Item> getBorrowedItems() {
        return borrowedItems;
    }

    @Override
    public void borrowItem(Item book){
        borrowedItems.add(book);
    }

    @Override
    public void returnItem(int choice){
        borrowedItems.remove(choice);
    }

    @Override
    public String customerInformation() {
        return "************Customer Information************"+
                "Name:"+this.name+"\n"+"Email:"+this.emailAdress+"\n"+"PhoneNumber:"+this.phoneNumber;
    }
}
