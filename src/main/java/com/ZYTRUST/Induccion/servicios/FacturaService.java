/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.servicios;

import com.ZYTRUST.Induccion.dto.MostrarFactura;
import com.ZYTRUST.Induccion.dto.MostrarFacturaPorId;
import com.ZYTRUST.Induccion.dto.RegistrarFactura;
import com.ZYTRUST.Induccion.modelos.Factura;

import java.util.List;

public interface FacturaService {


    public MostrarFacturaPorId crearFactura(RegistrarFactura factura);

    public List<Factura> listarFacturas();

    public Factura buscarFacturaPorId(String id);
}
