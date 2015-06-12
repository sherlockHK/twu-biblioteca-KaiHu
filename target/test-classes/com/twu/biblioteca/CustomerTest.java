package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2015/6/5.
 */
public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp(){
        customer = new Customer();
    }
    @Test
    public void test_getBorrowedBook_should_be_0() throws Exception {
        assertThat(customer.getBorrowedBooks().size(),is(0));
    }

    @Test
    public void test_borrowedBooks_should_add_one_after_borrow_one() throws Exception {
        Book book = new Book("name","author","2015");
        customer.borrowBook(book);
        assertThat(customer.getBorrowedBooks().size(),is(1));
    }

    @Test
    public void test_borrowedBooks_should_reduce_one_after_return_one() throws Exception {
        Book book = new Book("name","author","2015");
        customer.borrowBook(book);
        assertThat(customer.getBorrowedBooks().size(),is(1));
        customer.returnBook(0);
        assertThat(customer.getBorrowedBooks().size(),is(0));
    }
}
