package com.ejercicios.E06Ejemplo1.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER) //(EAGER)Cada vez que llame al objeto me traerá todos los datos de su asociación
    private List <Producto> productos = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<Categoria> subcategorias = new ArrayList<>();

    public Categoria(String nombre) {
        this.nombre = nombre;
    }




}
