package com.ejercicios.E06Ejemplo2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String orden, titulo, descripcion, url;

    @ManyToOne
    CursoOnline cursoOnline;

    public Video(String orden, String titulo, String descripcion, String url) {
        this.orden = orden;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

}
