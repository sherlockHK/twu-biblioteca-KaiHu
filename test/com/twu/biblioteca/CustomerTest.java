package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2015/6/5.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Library.class)
public class CustomerTest {
    @Test
    public void test_borrowedBookList_should_be_invoked() throws Exception {
        Customer customer = PowerMockito.mock(Customer.class);
        PowerMockito.doNothing().doThrow(new RuntimeException()).when(customer).borrowedBookList();
        customer.borrowedBookList();
    }

    @Test
    public void test_borrowedBooks_should_add_one_after_checkout_one() throws Exception {
        Customer customer = new Customer();
        Book book = new Book("name","author","2015");
        customer.checkoutBooks(book);
        assertThat(customer.getBorrowedBooks().size(),is(1));
    }
}
