package com.ejercicios.E06Ejemplo1.service;

import com.ejercicios.E06Ejemplo1.model.Categoria;
import com.ejercicios.E06Ejemplo1.repository.CategoriaRepository;
import com.ejercicios.E06Ejemplo1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
