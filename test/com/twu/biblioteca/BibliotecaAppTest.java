package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Administrator on 2015/6/3.
 */
public class BibliotecaAppTest {
    @Test
    public void test_showMenu() throws Exception {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        BibliotecaApp.showMenu();
        String out= baos.toString();
        assertThat(out,is(""));
    }

    @Test
    public void test_showBookList() throws Exception {
        

    }
}
