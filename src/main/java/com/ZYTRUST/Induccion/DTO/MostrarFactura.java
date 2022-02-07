package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class MostrarFactura {

    private String id;

    private MostrarCliente cliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    private List<MostrarDetalleFactura> detalles;

    public MostrarFactura(Factura factura){
        setId(factura.getId());
        setCliente(new MostrarCliente(factura.getCliente()));
        setDetalles(factura.getDetalles().stream().map(MostrarDetalleFactura::new).collect(Collectors.toList()));
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
