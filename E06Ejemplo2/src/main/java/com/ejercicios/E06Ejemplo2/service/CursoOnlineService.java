package com.ejercicios.E06Ejemplo2.service;

import com.ejercicios.E06Ejemplo2.model.CursoOnline;
import com.ejercicios.E06Ejemplo2.repository.CursoOnlineRepository;
import com.ejercicios.E06Ejemplo2.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoOnlineService extends BaseService<CursoOnline, Long, CursoOnlineRepository> {

    public CursoOnlineService(CursoOnlineRepository repo){
        super(repo);
    }

    @Override
    public List<CursoOnline> saveAll() {
        return null;
    }

    @Override
    public List<CursoOnline> findAll() {
        return this.repositories.findAll();
    }


}
