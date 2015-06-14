package com.twu.biblioteca.model;

/**
 * Created by Administrator on 2015/6/12.
 */
public abstract class Item {
    private String name;
    private String author;
    private String releaseYear;

    public Item(String name, String author, String releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getAuthor()+" "+this.getReleaseYear();
    }
}
