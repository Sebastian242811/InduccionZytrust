package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Producto;
import lombok.Data;


@Data
public class MostrarDetalleFactura {

    private Producto producto;

    private Integer Cantidad;

    MostrarDetalleFactura(Detalle_Factura detalle_factura){
        setCantidad(detalle_factura.getCantidad());
        setProducto(detalle_factura.getProducto());
    }
}
