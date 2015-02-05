package com.myreloader.manager;

import com.myreloader.manager.util.BaseCrudManager;
import com.myreloader.model.Book;

/**
 * Created by Justin on 2/5/2015.
 */

public interface BookManager extends BaseCrudManager<Book>{

    Iterable<Book> findBooksByAuthor(String author);
}
