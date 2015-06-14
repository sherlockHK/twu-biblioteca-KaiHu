package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/6/11.
 */
public class LibraryMenuTest {
    @Test
    public void testMainMenu() throws Exception {
        LibraryMenu menu = new LibraryMenu();
        assertEquals(4,menu.getOptions().size());
    }
}
