package com.twu.biblioteca.model;

/**
 * Created by Administrator on 2015/6/14.
 */
public class Movie extends Item{
    private int rating;

    public Movie(String name, String author, String releaseYear,int rating) {
        super(name, author, releaseYear);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getAuthor()+" "+this.rating+" "+this.getReleaseYear();
    }
}
