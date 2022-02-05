package com.ZYTRUST.Induccion.modelos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Detalle_FacturaId implements Serializable {

    private String factura;
    private String producto;
}
