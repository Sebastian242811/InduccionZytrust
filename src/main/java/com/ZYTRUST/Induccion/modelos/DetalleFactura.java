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

import javax.persistence.*;


/**
 * Esta clase representa a un detalle de una factura y debe ser usada como una
 * para almacenar y mostrar datos a los repositorios y la base de datos
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Table(name = "FAC_DETALLE_FACTURAS")
@Entity
@Data
@IdClass(DetalleFacturaId.class)
public class DetalleFactura {

    /**Factura a la cual esta asignada este DetalleFactura*/
    @Id
    @ManyToOne
    @JoinColumn(name = "DEFA_FACT_ID")
    private Factura factura;

    /**Producto al cual esta asignado este DetalleFactura*/
    @Id
    @ManyToOne
    @JoinColumn(name = "DEFA_PROD_ID")
    private Producto producto;

    /**Cantidad del producto asignado a la Factura*/
    @Column(name = "DEFA_CANTIDAD")
    private Integer cantidad;
}
