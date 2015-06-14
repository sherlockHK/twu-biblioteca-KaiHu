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

        options.add(MenuOption.checkoutBook);
        options.add(MenuOption.checkoutMoive);
        options.add(MenuOption.returnBack);
        options.add(MenuOption.information);

    }

    public ArrayList<MenuOption> getOptions(){
        return options;
    }

}
