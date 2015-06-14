package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
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
}
