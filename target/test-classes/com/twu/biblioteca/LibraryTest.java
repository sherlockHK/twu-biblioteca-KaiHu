package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Library.class)
public class LibraryTest {

    @Test
    public void test_bookList_should_be_invoked() throws Exception {
        Library lib = PowerMockito.mock(Library.class);
        PowerMockito.doNothing().doThrow(new RuntimeException()).when(lib).bookList();
        lib.bookList();
    }

    public void test_borrowedBookList_should_be_invoked() throws Exception {
        Library lib = PowerMockito.mock(Library.class);
        PowerMockito.doNothing().doThrow(new RuntimeException()).when(lib).borrowedBookList();
        lib.borrowedBookList();
    }


}