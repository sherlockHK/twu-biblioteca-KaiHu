package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by Administrator on 2015/6/11.
 */
public class CustomerInputTest {
    private CustomerInput customerInput;

    @Before
    public void setUp(){
        customerInput = new CustomerInput();
    }

    @Test
    public void testMakeChoice() throws Exception {
        int choice = customerInput.makeChoice();
//        Scanner scanner = mock(Scanner.class);
//        Mockito.when(scanner.nextInt())
//                .thenReturn(1);
        assertEquals(1, choice);
    }
}
