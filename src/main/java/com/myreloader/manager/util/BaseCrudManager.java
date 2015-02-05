package com.myreloader.manager.util;

/**
 * Created by Justin on 2/5/2015.
 */

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BaseCrudManager<E> {

    @Transactional
        E create(E entity);

    @Transactional
        String delete(String id);

    @Transactional(readOnly = true)
        E find(String id);

    @Transactional
        E update(E entity);

    @Transactional(readOnly = true)
    Iterable<E> findAll();

}
