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
public class ConsolePrinterTest {
    private ByteArrayOutputStream baos;
    private ConsolePrinter consolePrinter;

    @Before
    public void before(){
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        consolePrinter = new ConsolePrinter();
    }

    @Test
    public void testPrint() throws Exception {
        consolePrinter.print("test");
        assertThat(baos.toString(),containsString("test"));
    }

    @Test
    public void testPrintToConsole() throws Exception {
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist.add(new Book("a","b","c"));
        consolePrinter.printList(booklist);
        assertThat(baos.toString(), containsString("Quit"));
    }
}
