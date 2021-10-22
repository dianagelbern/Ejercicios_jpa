package com.practica.ejercicio02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
@Table(name = "product")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String nombre;
    @Column(name = "price")
    private double precio;
    @Column(name = "image")
    private String imagen;
    @Column(name = "description")
    private String descripcion;

}
