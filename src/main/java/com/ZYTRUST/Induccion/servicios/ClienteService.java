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

import com.ZYTRUST.Induccion.dto.MostrarCliente;
import com.ZYTRUST.Induccion.modelos.Cliente;

import java.util.List;


public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<MostrarCliente> listarCliente();
}
