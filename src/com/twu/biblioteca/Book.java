package com.twu.biblioteca;

import java.security.SecureRandom;
import java.util.Date;

/**
 * Created by Administrator on 2015/6/3.
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private String  publishedYear;


    public Book(int id, String name, String author, String publishedYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }
}
