package com.misicode._07JPA.Exercise.repository;

import java.util.List;

public interface CRUDRepository<T> {
    List<T> findAll();

    T findById(Object id);

    void save(T t);

    void delete(Object id);
}
