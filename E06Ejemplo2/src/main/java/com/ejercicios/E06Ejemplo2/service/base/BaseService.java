package com.ejercicios.E06Ejemplo2.service.base;

import com.ejercicios.E06Ejemplo2.model.CursoOnline;
import com.ejercicios.E06Ejemplo2.repository.CursoOnlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseService <T, ID, R extends JpaRepository<T,ID>> implements IBaseService<T, ID>{

    @Autowired
    protected R repositories;

    public BaseService(R repo) {
    }

    @Override
    public T save(T t) {
        return repositories.save(t);
    }

    public List<T> saveAll(List <T> lista){
        return repositories.saveAll(lista);
    }

    @Override
    public T findById(ID id) {
        return repositories.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repositories.findAll();
    }


    @Override
    public T edit(T t) {
        return repositories.save(t);
    }


    @Override
    public void delete(T t) {
        repositories.delete(t);
    }


    @Override
    public void deleteById(ID id) {
        repositories.deleteById(id);
    }

    public List<T> saveAll(Iterable<T> iterable) {
        return repositories.saveAll(iterable);
    }
}
