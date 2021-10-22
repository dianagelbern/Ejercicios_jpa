package com.ejercicios.E06Ejemplo2.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private int puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor", foreignKey = @ForeignKey(name = "FK_CUROSOONLINE_PROFESOR"))
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    public CursoOnline(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public void addVideos(Video v){
        v.setCursoOnline(this);
        this.videos.add(v);
    }

    public void removeVideos(Video v){
        this.videos.remove(v);
        v.setCursoOnline(null);
    }
}
