package com.ejercicios.E06Ejemplo2.service;

import com.ejercicios.E06Ejemplo2.model.Profesor;
import com.ejercicios.E06Ejemplo2.repository.CursoOnlineRepository;
import com.ejercicios.E06Ejemplo2.repository.ProfesorRepository;
import com.ejercicios.E06Ejemplo2.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
    public ProfesorService(CursoOnlineRepository repo) {
        super(repo);
    }
}
