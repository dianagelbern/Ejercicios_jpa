package com.ejercicios.E06Ejemplo1.repository;

import com.ejercicios.E06Ejemplo1.model.Categoria;
import com.ejercicios.E06Ejemplo1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(Categoria categoria);
}
