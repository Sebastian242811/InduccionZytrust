/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.modelos;

import lombok.Data;

import java.io.Serializable;

/**
 * Esta clase representa a una llave compuesta utilizada en la clase DetalleFactura
 * y debe ser usada como referencia en la utilizacion de esta
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */

@Data
public class DetalleFacturaId implements Serializable {

    /**Factura a la cual esta asignada este DetalleFactura*/
    private String factura;

    /**Producto al cual esta asignado este DetalleFactura*/
    private String producto;
}
