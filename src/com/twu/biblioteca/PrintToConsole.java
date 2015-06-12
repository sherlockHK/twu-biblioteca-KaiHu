package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/6/12.
 */
public class PrintToConsole {
    public void print(String test) {
        System.out.println(test);
    }

    public void printList(List list) {
        String printString = "";
        for (int i = 1; i <= list.size(); i++) {
            printString += i + "." + list.get(i - 1) + "\n";

            if (i == list.size())
                printString += (i + 1) + "." + "Quit!"; //add a Quit option
        }
        System.out.println(printString);
    }
}
