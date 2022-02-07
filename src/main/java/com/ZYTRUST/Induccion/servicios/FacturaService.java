package com.ZYTRUST.Induccion.servicios;

import com.ZYTRUST.Induccion.DTO.RegistrarFactura;
import com.ZYTRUST.Induccion.modelos.Factura;

import java.util.List;

public interface FacturaService {


    public Factura CreateFactura(RegistrarFactura factura);

    public List<Factura> ListFacturas();
}
