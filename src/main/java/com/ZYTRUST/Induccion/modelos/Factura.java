package com.ZYTRUST.Induccion.modelos;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "FAC_FACTURAS")
@Entity
@Data
public class Factura {
    @Id
    @Column(name = "FACT_ID")
    private String id;
    @ManyToOne
    @JoinColumn(name = "FACT_CLI_ID")
    private Cliente cliente;
    @Column(name = "FACT_FECHA_EMISION")
    private LocalDate fechaEmision;
    @Column(name = "FACT_FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;
    @Column(name = "FACT_ESTADO")
    private String estado;

    @OneToMany(mappedBy = "factura")
    private List<Detalle_Factura> detalles;

    public Factura(){
        this.setEstado("Entregado");
        this.setFechaEmision(LocalDate.now());
        this.setFechaVencimiento(LocalDate.now().plusDays(10));
    }
}
