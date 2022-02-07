package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Producto;
import lombok.Data;


@Data
public class MostrarDetalleFactura {

    //private MostrarFacturaenDetalle factura;

    private MostrarProducto producto;

    private Integer Cantidad;

    public MostrarDetalleFactura(Detalle_Factura detalle_factura){
        //MostrarFacturaenDetalle mostrarFactura= new MostrarFacturaenDetalle(detalle_factura.getFactura());
        setCantidad(detalle_factura.getCantidad());
        setProducto(new MostrarProducto(detalle_factura.getProducto()));
        //setFactura(mostrarFactura);
    }
}
