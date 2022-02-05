package com.ZYTRUST.Induccion.DTO;

import lombok.Data;

@Data
public class RegistrarDetalleFactura {

    private RegistrarFactura factura;

    private String productoId;

    private Integer Cantidad;
}
