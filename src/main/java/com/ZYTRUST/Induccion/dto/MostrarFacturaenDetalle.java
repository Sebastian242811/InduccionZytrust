package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

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
