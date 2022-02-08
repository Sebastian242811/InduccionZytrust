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

import com.ZYTRUST.Induccion.dto.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.DetalleFactura;

import java.util.List;

public interface DetalleFacturaService {

    public List<DetalleFactura> listarDetallesFacturas();

    public DetalleFactura crearDetalleFactura(RegistrarDetalleFactura detalleFactura);
}
