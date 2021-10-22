package com.ejercicios.E06Ejemplo1.service;

import com.ejercicios.E06Ejemplo1.model.Producto;
import com.ejercicios.E06Ejemplo1.repository.ProductoRepository;
import com.ejercicios.E06Ejemplo1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
