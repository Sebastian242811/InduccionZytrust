package com.ZYTRUST.Induccion.servicios;

import com.ZYTRUST.Induccion.DTO.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Factura;
import com.ZYTRUST.Induccion.repositorios.DetalleFacturaRepository;
import com.ZYTRUST.Induccion.repositorios.FacturaRepository;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DetalleFacturaService {

    public List<Detalle_Factura> ListarDetallesFacturas();

    public Detalle_Factura CreateDetalleFactura(RegistrarDetalleFactura detalleFactura);
}
