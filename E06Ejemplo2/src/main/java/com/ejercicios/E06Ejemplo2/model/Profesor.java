package com.ejercicios.E06Ejemplo2.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;
    private int puntuacion;

    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursosOnline = new ArrayList<>();

    //Preguntarle al profesor si estos helpers son válidos o deben encontrarse en CursosOnline



}
