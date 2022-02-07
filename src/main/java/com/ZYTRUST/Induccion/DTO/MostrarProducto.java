package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Producto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MostrarProducto {

    private String nombre;

    private String Descripcion;

    private BigDecimal precio;

    public MostrarProducto(Producto producto){
        setNombre(producto.getNombre());
        setDescripcion(producto.getDescripcion());
        setPrecio(producto.getPrecio());
    }
}
