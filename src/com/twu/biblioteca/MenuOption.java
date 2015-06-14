package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/6/11.
 */
public enum MenuOption {
    checkout("checkout"),
    returnItems("returnItems");

    private String optionName;

    MenuOption(String optionName) {
        this.optionName = optionName;
    }
}
