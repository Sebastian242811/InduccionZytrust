package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class MostrarFacturaPorId {

    private String id;

    private String nombreCliente;

    private String rucCliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    private List<MostrarDetalleFactura> detalles;

    public MostrarFacturaPorId(Factura factura){
        setId(factura.getId());
        setNombreCliente(factura.getCliente().getNombre());
        setRucCliente(factura.getCliente().getRUC());
        setDetalles(factura.getDetalles().stream().map(MostrarDetalleFactura::new).collect(Collectors.toList()));
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
