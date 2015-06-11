package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/6/11.
 */
public class LibraryMenu {
    private MenuOption[] options;

    public LibraryMenu() {
        menuInit();
    }

    private void menuInit() {
        this.options = new MenuOption[]{
                MenuOption.showAllBooks,
                MenuOption.checkoutBooks,
                MenuOption.returnBooks};
    }

    @Override
    public String toString() {
        String printString = "mainMenu:";
        for (int i = 1; i <= options.length; i++) {
            printString += "\n"+i+"."+options[i-1];
        }
        return printString;
    }
}
