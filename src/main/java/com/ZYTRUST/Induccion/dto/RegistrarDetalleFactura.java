package com.ZYTRUST.Induccion.dto;

import lombok.Data;

@Data
public class RegistrarDetalleFactura {

    private RegistrarFactura factura;

    private String productoId;

    private Integer cantidad;
}
