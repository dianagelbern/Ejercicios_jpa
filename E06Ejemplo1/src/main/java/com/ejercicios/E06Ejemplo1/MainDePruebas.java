package com.ejercicios.E06Ejemplo1;

import com.ejercicios.E06Ejemplo1.model.Categoria;
import com.ejercicios.E06Ejemplo1.model.Producto;
import com.ejercicios.E06Ejemplo1.service.CategoriaService;
import com.ejercicios.E06Ejemplo1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePruebas {

    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void test(){

        Producto p = new Producto("Coca-cola zero", 1.20);

        productoService.save(p);

        List<Categoria> subCategorias = List.of(

                Categoria.builder()
                        .nombre("Bebidas azucaradas")
                        .build(),
                Categoria.builder()
                        .nombre("Dietética")
                        .build()

        );

        categoriaService.saveAll(subCategorias);

        Categoria c1 = Categoria.builder()
                .nombre("Bebidas")
                .subcategorias(subCategorias)
                .build();
        categoriaService.save(c1);



        p.addCategoria(c1);

        System.out.printf("%s, %s\n", p.getNombre(), p.getCategoria().getNombre());
        System.out.printf("%s, %s\n", c1.getNombre(), c1.getSubcategorias().get(1).getNombre());

    }

}
