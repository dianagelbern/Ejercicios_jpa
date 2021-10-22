package com.ejercicios.E06Ejemplo2.repository;

import com.ejercicios.E06Ejemplo2.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
