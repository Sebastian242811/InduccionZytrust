package com.ZYTRUST.Induccion.modelos;

import lombok.Data;

import javax.persistence.*;

@Table(name = "FAC_DETALLE_FACTURAS")
@Entity
@Data
@IdClass(Detalle_FacturaId.class)
public class Detalle_Factura {

    @Id
    @ManyToOne
    @JoinColumn(name = "DEFA_FACT_ID")
    private Factura factura;

    @Id
    @ManyToOne
    @JoinColumn(name = "DEFA_PROD_ID")
    private Producto producto;

    @Column(name = "DEFA_CANTIDAD")
    private Integer Cantidad;
}
