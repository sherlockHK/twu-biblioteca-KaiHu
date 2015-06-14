package com.twu.biblioteca;

import com.twu.biblioteca.model.Item;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/14.
 */
public interface BorrowingAuthority {
    public ArrayList<Item> getBorrowedItems();
    public void borrowItem(Item item);
    public void returnItem(int choice);
}
