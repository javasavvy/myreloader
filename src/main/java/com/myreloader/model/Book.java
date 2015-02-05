package com.myreloader.model;

/**
 * Created by Justin on 1/30/2015.
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements BookInterface {

    @Id
    private String isbn;
    private String title;
    private String author;
    private String description;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
