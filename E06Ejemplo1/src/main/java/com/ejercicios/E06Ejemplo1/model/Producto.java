package com.ejercicios.E06Ejemplo1.model;


import lombok.*;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

@Builder
@Getter @Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;


    public void addCategoria (Categoria c){
        this.categoria = c;
        if(c.getProductos() == null)
            c.setProductos(new ArrayList<>());
        c.getProductos().add(this);
    }


    public void removeCateogria (Categoria c){
        c.getProductos().remove(this);
        this.categoria = null;
    }

    public Producto(String nombre, double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }
}
