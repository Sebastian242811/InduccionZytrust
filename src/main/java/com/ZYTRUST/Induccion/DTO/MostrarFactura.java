package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Factura;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class MostrarFactura {

    private String id;

    private Cliente cliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    private List<MostrarDetalleFactura> detalles;

    public MostrarFactura(Factura factura){
        setId(factura.getId());
        setCliente(factura.getCliente());
        setDetalles(factura.getDetalles().stream().map(MostrarDetalleFactura::new).collect(Collectors.toList()));
        setFechaEmision(factura.getFechaEmision());
        setFechaVencimiento(factura.getFechaVencimiento());
        setEstado(factura.getEstado());
    }
}
