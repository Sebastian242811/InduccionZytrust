/*
 * @(#)RegistrarFactura.java
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
 * Esta clase representa a la entidad Factura como entidad de paso de
 * datos para proteger la informacion de los modelos. Debe usarse para registrar
 * la informacion, de la tabla mencionada o relacionadas, al cliente.
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Data
public class RegistrarFactura {

    private String id;

    private String clienteId;

    private String fechaVencimiento;

    private String productoId;

    private Integer cantidad;
}
