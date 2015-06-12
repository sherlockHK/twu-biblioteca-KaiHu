package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/6/11.
 */
public enum MenuOption {
    checkoutBooks("checkoutBooks"),
    returnBooks("returnBooks"),
    exit("exit");

    private String optionName;

    MenuOption(String optionName) {
        this.optionName = optionName;
    }
}
