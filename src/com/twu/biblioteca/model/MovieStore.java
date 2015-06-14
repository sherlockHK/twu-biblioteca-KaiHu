package com.twu.biblioteca.model;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/14.
 */
public class MovieStore extends ItemStore{
    public MovieStore() {super(new ArrayList<Movie>());}

    @Override
    void dataInit() {
        Movie movie_one = new Movie("Leno","Luc Besson","1994",9);
        Movie movie_two = new Movie("Forrest Gump","Robert","1994",9);
        Movie movie_three = new Movie("WALL E","Andrew Stanton","2008",8);

        itemList.add(movie_one);
        itemList.add(movie_two);
        itemList.add(movie_three);
    }
}
