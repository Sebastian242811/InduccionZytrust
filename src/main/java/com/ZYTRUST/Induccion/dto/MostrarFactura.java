/*
 * @(#)MostrarFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;

/**
 * Esta clase representa a la entidad Factura como entidad de paso de
 * datos para proteger la informacion de los modelos. Debe usarse para mostrar
 * la informacion, de la tabla mencionada o relacionadas, al cliente.
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Data
public class MostrarFactura {

    private String id;

    private String nombreCliente;

    private String rucCliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    public MostrarFactura(Factura factura){
        setId(factura.getId());
        setNombreCliente(factura.getCliente().getNombre());
        setRucCliente(factura.getCliente().getRuc());
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
