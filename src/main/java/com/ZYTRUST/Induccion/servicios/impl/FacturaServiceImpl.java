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

import com.ZYTRUST.Induccion.dto.MostrarFactura;
import com.ZYTRUST.Induccion.dto.MostrarFacturaPorId;
import com.ZYTRUST.Induccion.dto.RegistrarFactura;
import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import com.ZYTRUST.Induccion.modelos.Factura;
import com.ZYTRUST.Induccion.repositorios.ClienteRepository;
import com.ZYTRUST.Induccion.repositorios.DetalleFacturaRepository;
import com.ZYTRUST.Induccion.repositorios.FacturaRepository;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa la implementacion del Interface FacturaService
 * Debe usarse para añadir todas las implementaciones de las funciones relacionadas
 * con la tabla Factura
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    /**Dedicada a crear una nueva Factura
     *
     * @param factura es el parametro tipo Registrar factura el cual se utilizara
     * para añadir la informacion a la base de datos
     * @return MostrarFacturaPorId es el tipo de variable de retorno que se
     * necesita, en este caso devolvemos un objeto creado en esa misma linea la
     * cual servira al cliente para confirmar lo añadido recientemente
     * */
    @Override
    public MostrarFacturaPorId crearFactura(RegistrarFactura factura) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        Factura facturaProvisional = new Factura();
        DetalleFactura detalle = new DetalleFactura();
        List<DetalleFactura> detallesFactura = new ArrayList<>();
        facturaProvisional.setEstado("Entregado");
        facturaProvisional.setFechaEmision(LocalDate.now());
        facturaProvisional.setFechaVencimiento(LocalDate.parse(factura.getFechaVencimiento(),dateTimeFormatter));
        facturaProvisional.setId(factura.getId());
        facturaProvisional.setCliente(clienteRepository.findById(factura.getClienteId()).get());
        detalle.setFactura(facturaRepository.save(facturaProvisional));
        detalle.setProducto(productoRepository.getById(factura.getProductoId()));
        detalle.setCantidad(factura.getCantidad());
        detalleFacturaRepository.save(detalle);
        detallesFactura.add(detalle);
        facturaProvisional.setDetalles(detallesFactura);
        return new MostrarFacturaPorId(facturaProvisional);
    }

    /**Dedicada a listar las Facturas existentes
     *
     * @return La funcion retorna la lista de todas las facturas encontradas en
     * la base de datos*/
    @Override
    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    /**Dedicada a buscar una Factura por su identificador
     *
     * @param id es el identificador(numero de la factura) de la factura que se desea buscar*/
    @Override
    public Factura buscarFacturaPorId(String id) {
        return facturaRepository.findById(id).get();
    }
}
