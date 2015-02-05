package com.myreloader.manager.impl;

import com.myreloader.dao.BookDao;
import com.myreloader.manager.BookManager;
import com.myreloader.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Justin on 2/5/2015.
 */
@Service ("bookManager")
public class BookManagerImpl implements BookManager {

    @Autowired
    protected BookDao bookDao;

    @Transactional(readOnly = true)
    public Iterable<Book> finaAll() {
        return bookDao.findAll();   // uses the findAll() method inherited from CrudRepository
    }

    @Override
    public Book create(Book entity) {
        return null;
    }

    @Override
    public String delete(String id) {
        try {
            bookDao.delete(id);
            return String.format("Book [%s] successfully deleted", id);// uses the delete() method inherited from CrudRepository
        } catch (Exception e) {
            return String.format("A problem occurred when deleting Book [%s]", e.getMessage());
        }
    }

    @Override
    public Book find(String id) {
        return bookDao.findOne(id); // uses the findOne() method inherited from CrudRepository
    }

    @Override
    public Book update(Book entity) {
        return null;
    }

    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Override
    public Iterable<Book> findBooksByAuthor(String author){
        return bookDao.findBooksByAuthor(author);   // uses the custom method defined in our bookDao interface
    }
}
