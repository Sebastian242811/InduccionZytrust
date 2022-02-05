package com.ZYTRUST.Induccion.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "FAC_PRODUCTOS")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @Column(name = "PROD_ID")
    private String id;
    @Column(name = "PROD_NOMBRE")
    private String nombre;
    @Column(name = "PROD_DESCRIPCION")
    private String Descripcion;
    @Column(name = "PROD_PRECIO")
    private BigDecimal precio;
}
