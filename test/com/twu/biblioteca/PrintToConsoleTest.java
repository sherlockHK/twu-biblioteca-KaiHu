package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2015/6/12.
 */
public class PrintToConsoleTest {
    private ByteArrayOutputStream baos;
    private PrintToConsole printToConsole;

    @Before
    public void before(){
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        printToConsole = new PrintToConsole();
    }

    @Test
    public void testPrint() throws Exception {
        printToConsole.print("test");
        assertThat(baos.toString(),containsString("test"));
    }

    @Test
    public void testPrintToConsole() throws Exception {
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist.add(new Book("a","b","c"));
        printToConsole.printList(booklist);
        assertThat(baos.toString(), containsString("Quit"));
    }
}
