/*
 * @(#)MostrarDetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Esta clase representa a la entidad DetalleFactura como entidad de paso de
 * datos para proteger la informacion de los modelos. Debe usarse para mostrar
 * la informacion, de la tabla mencionada o relacionadas, al cliente.
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Data
public class MostrarDetalleFactura {

    /**Nombre del producto en este detalle de factura*/
    private String nombreProducto;

    /**Descripcion del producto en este detalle de factura*/
    private String descripcionProducto;

    /**Precio del producto en este detalle de factura*/
    private BigDecimal precioPorducto;

    /**Cantidad de este producto que ha sido adquirida por el cliente*/
    private Integer cantidad;

    /**sub Total del detalle actual a la Factura asignada*/
    private BigDecimal subTotal;

    /**Constructor del DTO el pasa los datos de la entidad DetalleFactura a
     * MostrarDetalleFactura
     *
     * @param detalleFactura el cual se desea convertir a tipo MostrarDetalleFactura
     */
    public MostrarDetalleFactura(DetalleFactura detalleFactura){
        setCantidad(detalleFactura.getCantidad());
        setNombreProducto(detalleFactura.getProducto().getNombre());
        setDescripcionProducto(detalleFactura.getProducto().getDescripcion());
        setPrecioPorducto(detalleFactura.getProducto().getPrecio());
        setSubTotal(BigDecimal.valueOf(cantidad).multiply(getPrecioPorducto()));
    }
}
