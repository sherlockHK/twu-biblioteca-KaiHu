package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/6/11.
 */
public class BookStoreTest {
    private BookStore bookStore;

    @Before
    public void setUp(){
        bookStore = new BookStore();
    }

    @Test
    public void testAllBookList() throws Exception {
        assertEquals(5,bookStore.allBookList().size());
    }

    @Test
    public void allBookList_should_reduce_one_after_checkout() throws Exception {
        bookStore.checkoutBook(1);
        assertEquals(4,bookStore.allBookList().size());
    }

    @Test
    public void bookList_should_be_5() throws Exception {
        assertEquals(5,bookStore.bookCount());
    }
}