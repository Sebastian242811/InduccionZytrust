/*
 * @(#)FacturaController.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.dto.*;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase representa al controlador de la clase Factura,
 * el cual se debera utilizar para exponer los endpoints y las url´s
 * relacionadas con este modelo
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@RestController
@RequestMapping(value = "/facturas")
public class FacturaController {

    /**Inyeccion de dependencias del servicio Factura*/
    @Autowired
    private FacturaService facturaService;

    /**EndPoint dedicado a listar Facturas existentes*/
    @GetMapping()
    public List<MostrarFactura> listarFacturas(){
        return facturaService.listarFacturas().stream().map(MostrarFactura::new).collect(Collectors.toList());
    }

    @GetMapping("/inter")
    public List<MostrarFacturaI> listarFacturasInter(){
        return facturaService.listALLInter();
    }

    @GetMapping("/class")
    public List<MostrarFacturaClass> listarFacturasclas(){
        return facturaService.listALLClas();
    }

    /**EndPoint dedicado a generar nuevas Facturas*/
    @PostMapping()
    public MostrarFacturaPorId createFactura(@RequestBody() RegistrarFactura registrarFactura){
        return facturaService.crearFactura(registrarFactura);
    }

    @GetMapping({"/{id}"})
    public MostrarFacturaPorId buscarFacturaPorId(@PathVariable String id){
        return new MostrarFacturaPorId(facturaService.buscarFacturaPorId(id));
    }
}
