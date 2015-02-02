package com.myreloader.dao;

/**
 * Created by Justin on 1/30/2015.
 */
/*
        By annotating an interface with @Repository and making this interface extend CrudRepositoryYou will get
        among other things 2 pretty nifty goodies of the box:

        Some utility CRUD methods such as findAll() or count()
        Auto-implementation of methods based on naming convention such as findBooksByAuthor()
        And the best part is you get all of this without writing any code logic for these methods
*/
import com.myreloader.dao.BookDao;
import com.myreloader.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDao extends CrudRepository<Book, String> {

    public Iterable<Book>findBooksByAuthor(@Param("author")String author);

}
