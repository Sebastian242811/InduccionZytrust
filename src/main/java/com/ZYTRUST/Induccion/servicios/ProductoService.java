package com.ZYTRUST.Induccion.servicios;

import com.ZYTRUST.Induccion.modelos.Producto;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public Producto CreateProducto(Producto producto){
        return productoRepository.save(producto);
    }
}
