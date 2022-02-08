package com.ZYTRUST.Induccion.dto;

import com.ZYTRUST.Induccion.modelos.DetalleFactura;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class MostrarDetalleFactura {

    private String nombreProducto;

    private String descripcionProducto;

    private BigDecimal precioPorducto;

    private Integer cantidad;

    public MostrarDetalleFactura(DetalleFactura detalle_factura){
        setCantidad(detalle_factura.getCantidad());
        setNombreProducto(detalle_factura.getProducto().getNombre());
        setDescripcionProducto(detalle_factura.getProducto().getDescripcion());
        setPrecioPorducto(detalle_factura.getProducto().getPrecio());
    }
}
