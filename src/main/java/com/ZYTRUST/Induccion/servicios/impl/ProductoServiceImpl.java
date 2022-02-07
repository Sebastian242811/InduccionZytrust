package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.modelos.Producto;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import com.ZYTRUST.Induccion.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto CreateProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}
