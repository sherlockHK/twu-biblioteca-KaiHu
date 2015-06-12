package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/6/11.
 */
public class LibraryMenu {
    private ArrayList<MenuOption> options;

    public LibraryMenu() {
        menuInit();
    }

    private void menuInit() {
        options = new ArrayList<MenuOption>();

        options.add(MenuOption.checkoutBooks);
        options.add(MenuOption.returnBooks);
    }

    public ArrayList<MenuOption> getOptions(){
        return options;
    }

//    @Override
//    public String toString() {
//        String printString = "mainMenu:";
//        for (int i = 1; i <= options.length; i++) {
//            printString += "\n"+i+"."+options[i-1];
//        }
//        return printString;
//    }
}