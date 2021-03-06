package com.ejercicios.E06Ejemplo2.service.base;

import java.util.List;

public interface IBaseService <T, ID>{

    T save(T t);

    List<T> saveAll();

    T findById(ID id);

    List<T> findAll();

    T edit(T t);

    void delete(T t);

    void deleteById(ID id);
}
