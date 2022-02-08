/*
 * @(#)Factura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.modelos;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Esta clase representa a una Factura y debe ser usada como una
 * para almacenar y mostrar datos a los repositorios y la base de datos
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Table(name = "FAC_FACTURAS")
@Entity
@Data
public class Factura {

    /**Identificador de la Factura*/
    @Id
    @Column(name = "FACT_ID")
    private String id;

    /**Cliente al cual esta asignada esta factura*/
    @ManyToOne
    @JoinColumn(name = "FACT_CLI_ID")
    private Cliente cliente;

    /**Fecha de emision de la Factura*/
    @Column(name = "FACT_FECHA_EMISION")
    private LocalDate fechaEmision;

    /**Fecha de vencimiento de la Factura*/
    @Column(name = "FACT_FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    /**Estado de la Factura en determinado periodo(Entregada, Anulada, confirmada)*/
    @Column(name = "FACT_ESTADO")
    private String estado;

    /**Lista de los detalles de facturas(productos y cantidades) asignados a esta factura*/
    @OneToMany(mappedBy = "factura")
    private List<DetalleFactura> detalles;
}
