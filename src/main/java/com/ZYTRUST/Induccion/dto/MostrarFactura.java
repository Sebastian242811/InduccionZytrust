package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;

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
        setRucCliente(factura.getCliente().getRUC());
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
