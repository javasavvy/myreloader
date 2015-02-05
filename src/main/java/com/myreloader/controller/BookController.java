package com.myreloader.controller;

/**
 * Created by Justin on 1/30/2015.
 */

import com.myreloader.dao.BookDao;
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
    protected BookDao bookDao;

    @RequestMapping
    public Iterable<Book> books() {
        return bookDao.findAll(); // uses the findAll() method inherited from CrudRepository
    }


    @RequestMapping(value = "/{isbn}")
    public Book book(@PathVariable("isbn") String isbn) {
        return bookDao.findOne(isbn);// uses the findOne() method inherited from CrudRepository
// adding a comment
    }


    @RequestMapping(value = "/{isbn}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("isbn") String isbn) {

        try {
            bookDao.delete(isbn);
            return String.format("Book [%s] successfully deleted", isbn);// uses the delete() method inherited from CrudRepository
        } catch (Exception e) {
            return String.format("A problem occurred when deleting Book [%s]", e.getMessage());
        }
    }

    @RequestMapping("/author/{author}")
    public Iterable<Book> booksByAuthor(@PathVariable("author") String author) {

        return bookDao.findBooksByAuthor(author);// uses the custom method defined in our bookDao interface
    }


}