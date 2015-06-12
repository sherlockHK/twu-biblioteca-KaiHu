package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/6/3.
 */
public class Book {
    private String name;
    private String author;
    private String publishedYear;

    public Book(String name, String author, String publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public String getPublishedYear() {
        return publishedYear;
    }


//    public String bookInfo(){
//        return this.getName()+"  "+this.getAuthor()+"  "+this.getPublishedYear();
//    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getAuthor()+" "+this.getPublishedYear();
    }
}