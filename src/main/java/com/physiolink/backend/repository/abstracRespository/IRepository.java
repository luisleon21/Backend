package com.physiolink.backend.repository.abstracRespository;

import java.util.List;

public interface IRepository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void deleteById(ID id);
}