package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MostrarFacturaenDetalle {
    private String id;

    private Cliente cliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    public MostrarFacturaenDetalle(Factura factura){
        setId(factura.getId());
        setCliente(factura.getCliente());
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
