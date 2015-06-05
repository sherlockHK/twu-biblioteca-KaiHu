package com.twu.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by Administrator on 2015/6/3.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(BibliotecaApp.class)
public class BibliotecaAppTest {

    Answer<Object> defaultAnswer = new Answer<Object>() {
        @Override
        public Object answer(InvocationOnMock invocation) throws Throwable {
            System.out.println("invoked!");
            return null;
        }
    };

    @Test
    public void test_showMenu() throws Exception {
        PowerMockito.mockStatic(BibliotecaApp.class);
        PowerMockito.doAnswer(defaultAnswer).when(BibliotecaApp.class, "showMenu");
        BibliotecaApp.showMenu();
    }

    @Test
    public void test_showBookList() throws Exception {

    }
}
