package com.ejercicios.E06Ejemplo2;

import com.ejercicios.E06Ejemplo2.service.CursoOnlineService;
import com.ejercicios.E06Ejemplo2.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;


}
