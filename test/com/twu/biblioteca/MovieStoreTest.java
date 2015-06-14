package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.MovieStore;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2015/6/14.
 */
public class MovieStoreTest {
    private MovieStore movieStore;

    @Before
    public void setUp(){movieStore = new MovieStore();}

    @Test
    public void testMovieList() throws Exception {
        assertEquals(3,movieStore.itemList().size());
    }

    @Test
    public void allMovieList_should_reduce_one_after_checkout() throws Exception {
        movieStore.checkoutItem(1);
        assertEquals(2, movieStore.itemsCount());
    }

    @Test
    public void allMovieList_should_add_one_after_reserveBook() throws Exception {
        movieStore.reserveItem(new Movie("a","b","c",10));
        assertEquals(4, movieStore.itemsCount());
    }
}
