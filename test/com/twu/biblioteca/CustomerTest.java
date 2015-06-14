package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.util.ConsolePrinter;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2015/6/5.
 */
public class CustomerTest {
    private Customer customer;
    private ByteArrayOutputStream baos;
    private ConsolePrinter consolePrinter;

    @Before
    public void setUp(){
        customer = new Customer("a","b",1);
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        consolePrinter = new ConsolePrinter();
    }
    @Test
    public void test_getBorrowedBook_should_be_0() throws Exception {
        assertThat(customer.getBorrowedItems().size(),is(0));
    }

    @Test
    public void test_borrowedBooks_should_add_one_after_borrow_one() throws Exception {
        Book book = new Book("name","author","2015");
        customer.borrowItem(book);
        assertThat(customer.getBorrowedItems().size(),is(1));
    }

    @Test
    public void test_borrowedBooks_should_reduce_one_after_return_one() throws Exception {
        Book book = new Book("name","author","2015");
        customer.borrowItem(book);
        assertThat(customer.getBorrowedItems().size(),is(1));
        customer.returnItem(0);
        assertThat(customer.getBorrowedItems().size(),is(0));
    }

    @Test
    public void test_customerInformation_shoulde_be_printed() throws Exception {
        String info = customer.customerInformation();
        consolePrinter.print(info);
        assertThat(baos.toString(), containsString("Customer Information"));
    }

    @Test
    public void test_loginAuthenticate_should_return_true() throws Exception {
        boolean result = customer.loginAuthenticate(123,"abc");
        assertTrue(result);
    }
}
