/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.dto.MostrarProducto;
import com.ZYTRUST.Induccion.modelos.Producto;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import com.ZYTRUST.Induccion.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase representa la implementacion del Interface ProductoService
 * Debe usarse para añadir todas las implementaciones de las funciones relacionadas
 * con la tabla Producto
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    /**Dedicada a crear un nuevo Producto*/
    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<MostrarProducto> listarProductos() {
        return productoRepository.listarProductos();
    }
}
