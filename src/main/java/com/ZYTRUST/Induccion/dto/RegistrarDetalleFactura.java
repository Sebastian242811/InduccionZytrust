/*
 * @(#)RegistrarDetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.dto;

import lombok.Data;

/**
 * Esta clase representa a la entidad DetalleFactura como entidad de paso de
 * datos para proteger la informacion de los modelos. Debe usarse para ingresar
 * la informacion, de la tabla mencionada o relacionadas, al cliente.
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Data
public class RegistrarDetalleFactura {

    private RegistrarFactura factura;

    private String productoId;

    private Integer cantidad;
}
