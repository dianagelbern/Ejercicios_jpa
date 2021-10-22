package com.ejercicios.E06Ejemplo1.repository;

import com.ejercicios.E06Ejemplo1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
