/*
 * @(#)Producto.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Esta clase representa a un Producto y debe ser usada como una
 * para almacenar y mostrar datos a los repositorios y la base de datos
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Table(name = "FAC_PRODUCTOS")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    /**Identificador de Producto*/
    @Id
    @Column(name = "PROD_ID")
    private String id;

    /**Nombre de Producto*/
    @Column(name = "PROD_NOMBRE")
    private String nombre;

    /**Descripcion de Producto*/
    @Column(name = "PROD_DESCRIPCION")
    private String descripcion;

    /**Precio de Producto*/
    @Column(name = "PROD_PRECIO")
    private BigDecimal precio;
}
