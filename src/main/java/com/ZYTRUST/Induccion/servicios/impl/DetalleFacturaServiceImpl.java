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

import com.ZYTRUST.Induccion.dto.MostrarFacturaPorId1;
import com.ZYTRUST.Induccion.dto.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import com.ZYTRUST.Induccion.repositorios.DetalleFacturaRepository;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import com.ZYTRUST.Induccion.servicios.DetalleFacturaService;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase representa la implementacion del Interface DetalleFacturaService
 * Debe usarse para añadir todas las implementaciones de las funciones relacionadas
 * con la tabla DetalleFactura
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    @Autowired
    private FacturaService facturaService;

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(DetalleFacturaServiceImpl.class);

    /**Dedicada a listar a los clientes guardados en la base de datos*/
    @Override
    public List<DetalleFactura> listarDetallesFacturas() {
        return detalleFacturaRepository.findAll();
    }

    /**Dedicada a crear un nuevo DetalleFactura*/
    @Override
    public DetalleFactura crearDetalleFactura(RegistrarDetalleFactura detalleFactura) {
        DetalleFactura detalleFactura1= new DetalleFactura();
        if(facturaService.buscarFacturaPorId(detalleFactura.getFactura().getId()) == null){
            logger.debug("La factura Ingresada no existe. Creando nueva..");
        }
        MostrarFacturaPorId1 mostrarFactura = facturaService.crearFactura(detalleFactura.getFactura());
        //detalleFactura1.setFactura(facturaService.buscarFacturaPorId(mostrarFactura.getId()));
        detalleFactura1.setProducto(productoRepository.findById(detalleFactura.getProductoId()).get());
        detalleFactura1.setCantidad(detalleFactura.getCantidad());
        return detalleFacturaRepository.save(detalleFactura1);
    }
}
