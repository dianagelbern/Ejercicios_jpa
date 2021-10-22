package com.ejercicios.E06Ejemplo2.repository;

import com.ejercicios.E06Ejemplo2.model.CursoOnline;
import com.ejercicios.E06Ejemplo2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline, Long> {

    @Query("select distinct c from Compuesto c join fetch c.videos")
    List<CursoOnline> findAllJoin();
}
