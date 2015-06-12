package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
/**
 * Created by Administrator on 2015/6/3.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(BibliotecaApp.class)
public class BibliotecaAppTest {

    private ByteArrayOutputStream baos;
    private BibliotecaApp app;
//    private PrintStream console;

    @Before
    public void before(){
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        app = new BibliotecaApp();
    }

    @Test
    public void testWelcome() throws Exception {
        app.welcome();
        assertThat(baos.toString(),containsString("Welcome"));
    }

    @Test
    public void testShowMenu() throws Exception {
        app.showMenu();
        assertThat(baos.toString(), containsString("Main menu"));
    }


}
