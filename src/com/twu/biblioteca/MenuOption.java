package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/6/11.
 */
public enum MenuOption {
    showAllBooks("showAllBooks"),checkoutBooks("checkoutBooks"),returnBooks("returnBooks");

    private String optionName;

    MenuOption(String optionName) {
        this.optionName = optionName;
    }
}
