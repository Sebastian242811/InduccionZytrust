package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class MostrarFacturaPorId  implements Serializable {
    private String id;

    private String nombreCliente;

    private String rucCliente;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private String estado;

    private BigDecimal total = new BigDecimal(0);

    private List<MostrarDetalleFactura> detalles;

    @JsonIgnore
    private transient List<DetalleFactura> detallesobj;
}
