package org.example.javawebapp.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T>{
    List<T> getAll();

    void create(T e);

    void update(T e);

    void delete(T e);
}
