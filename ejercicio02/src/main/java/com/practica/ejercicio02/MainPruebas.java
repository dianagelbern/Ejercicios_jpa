package com.practica.ejercicio02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPruebas {

    private final PaisRepository pais;
    private final ProductoRepository producto;

    @PostConstruct
    public void test(){

        Pais p = Pais.builder()
                .nombre("España")
                .build();

        pais.save(p);

        pais.findAll().forEach(System.out::println);


        Producto pr = Producto.builder()
                .nombre("Nutella")
                .precio(2.20)
                .imagen("url")
                .descripcion("Producto hecho a base de avellanas y cacao")
                .build();


        producto.save(pr);

        producto.findAll().forEach(System.out::println);
    }

}
