package com.ZYTRUST.Induccion.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@Value
@AllArgsConstructor
public class MostrarFactura {

    private String id;

    private String nombreCliente;

    private String rucCliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;
}
