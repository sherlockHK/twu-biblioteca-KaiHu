package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2015/6/14.
 */
public class MovieTest {
    @Test
    public void testMovieToString() throws Exception {
        Movie movie = new Movie("name","director","releaseYear",6);
        assertThat("name director 6 releaseYear",is(movie.toString()));

    }
}
