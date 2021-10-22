package com.ejercicios.E06Ejemplo2.service.base;

import com.ejercicios.E06Ejemplo2.repository.CursoOnlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService <T, ID, R extends JpaRepository<T,ID>>{

    @Autowired
    protected R repositorio;


    public BaseService(R repo) {
        this.repositorio = repo;
    }
}
