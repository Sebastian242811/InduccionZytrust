/*
 * @(#)MostrarFacturaenDetalle.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase representa a la entidad Factura como entidad de paso de
 * datos para proteger la informacion de los modelos. Debe usarse para mostrar
 * la informacion, de la tabla mencionada o relacionadas, al cliente.
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Data
public class MostrarFacturaenDetalle {
    private String id;

    private Cliente cliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    private List<MostrarDetalleFactura> detalles;

    public MostrarFacturaenDetalle(Factura factura){
        setId(factura.getId());
        setCliente(factura.getCliente());
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
        setDetalles(factura.getDetalles().stream().map(MostrarDetalleFactura::new).collect(Collectors.toList()));
    }
}
