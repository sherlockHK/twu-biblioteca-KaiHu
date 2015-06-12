package com.twu.biblioteca;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/6/11.
 */
public class LibraryMenuTest {
    @Test
    public void testMainMenu() throws Exception {
//        String mockMenuString = "mainMenu:" +"\n"+"1.showAllBooks"+"\n"+"2.checkoutBooks"+"\n"+"3.returnBooks";
        LibraryMenu menu = new LibraryMenu();
        assertEquals(3,menu.getOptions().size());
    }
}
