package com.twu.biblioteca;

import java.util.ArrayList;

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

        options.add(MenuOption.checkout);
        options.add(MenuOption.returnItems);
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
