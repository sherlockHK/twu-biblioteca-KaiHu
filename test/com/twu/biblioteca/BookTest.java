package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2015/6/11.
 */
public class BookTest {
    @Test
    public void testBookToString() throws Exception {
        Book book = new Book("name","author","2015");
        assertEquals("name author 2015",book.toString());
    }
}
