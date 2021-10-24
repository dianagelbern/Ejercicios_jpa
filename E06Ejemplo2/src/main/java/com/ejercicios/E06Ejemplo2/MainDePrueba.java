package com.ejercicios.E06Ejemplo2;

import com.ejercicios.E06Ejemplo2.model.CursoOnline;
import com.ejercicios.E06Ejemplo2.model.Profesor;
import com.ejercicios.E06Ejemplo2.model.Video;
import com.ejercicios.E06Ejemplo2.service.CursoOnlineService;
import com.ejercicios.E06Ejemplo2.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void test(){

        Profesor carlos  = Profesor.builder()
                .nombre("Carlos")
                .email("carlos@email.com")
                .puntuacion(4)
                .cursosOnline(new ArrayList<>())
                .build();

        profesorService.save(carlos);


        List<Video> videos = List.of(
                Video.builder()
                        .orden("44")
                        .titulo("Introducción")
                        .descripcion("En esta primer clase el profesor se presentará y dará una breve introducción")
                        .url("www.descripcionvideo.com")
                        .build(),

                Video.builder()
                        .orden("45")
                        .titulo("Materiales")
                        .descripcion("En esta clase el profesor recoemndará algunos materiales necesarios para las próximas clases")
                        .url("www.materialesvideo.com")
                        .build()
        );

        CursoOnline curso1 = CursoOnline.builder()
                .nombre("Acceso a Datos")
                .puntuacion(4)
                .videos(videos)
                .build();

        cursoOnlineService.save(curso1);
        curso1.addProfesor(carlos);
        System.out.printf("Nombre: %s, Profesor: %s\n", curso1.getNombre(), curso1.getProfesor().getNombre());

        System.out.println("Vídeos de " + curso1.getNombre() + ":");
        curso1.getVideos().forEach(v -> {
            System.out.println("- " + v.getTitulo());
        });
        /*
        List<CursoOnline> resultado = cursoOnlineService.findAll();

        System.out.println("\n");
        for (CursoOnline c : resultado){
            System.out.println("Curso: " + c);
            System.out.println("Vídeos: " + c.getVideos());
        }

         */
    }
}
