/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.dto.MostrarDetalleFactura;
import com.ZYTRUST.Induccion.dto.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import com.ZYTRUST.Induccion.servicios.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase representa al controlador de la clase DetalleFactura,
 * el cual se debera utilizar para exponer los endpoints y las url´s
 * relacionadas con este modelo
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@RestController
@RequestMapping(value = "/factura/detalles")
public class DetalleFacturaController {

    /**Inyeccion de dependencias del servicio DetalleFactura*/
    @Autowired
    private DetalleFacturaService detalleFacturaService;

    /**EndPoint dedicado a listar los DetallesFacturas existentes*/
    @GetMapping
    public List<DetalleFactura> ListarDetalles(){
        return detalleFacturaService.listarDetallesFacturas();
    }

    /**EndPoint dedicado a crear DetallesFacturas existentes*/
    @PostMapping
    public MostrarDetalleFactura CrearDetalle(@RequestBody RegistrarDetalleFactura registrarDetalleFactura){
        return new MostrarDetalleFactura(detalleFacturaService.crearDetalleFactura(registrarDetalleFactura));
    }
}
