package com.ZYTRUST.Induccion.dto;

import lombok.Data;



@Data
public class RegistrarFactura {

    private String id;

    private String clienteId;

    private String fechaVencimiento;

    private String productoId;

    private Integer cantidad;
}
