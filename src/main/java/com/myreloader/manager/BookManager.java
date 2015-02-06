package com.myreloader.manager;

import com.myreloader.manager.util.BaseCrudManager;
import com.myreloader.model.Book;
import com.myreloader.model.BookImpl;

/**
 * Created by Justin on 2/5/2015.
 */

public interface BookManager extends BaseCrudManager<BookImpl>{

    Iterable<BookImpl> findBooksByAuthor(String author);
}
