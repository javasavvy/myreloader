package com.myreloader.controller;

/**
 * Created by Justin on 1/30/2015.
 */

import com.myreloader.manager.BookManager;
import com.myreloader.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController // assumes @ResponseBody annotation in methods annotated with  @RequestMapping
@RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    @Autowired
    private BookManager bookManager;

    @RequestMapping
    public Iterable<Book> books() {
        return bookManager.findAll();
    }


    @RequestMapping(value = "/{isbn}")
    public Book book(@PathVariable("isbn") String isbn) {
        return bookManager.find(isbn);
    }


    @RequestMapping(value = "/{isbn}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("isbn") String isbn) {
        return bookManager.delete(isbn);
    }

    @RequestMapping("/author/{author}")
    public Iterable<Book> booksByAuthor(@PathVariable("author") String author) {
        return bookManager.findBooksByAuthor(author);

    }


}