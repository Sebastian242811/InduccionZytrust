package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.DTO.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Factura;
import com.ZYTRUST.Induccion.repositorios.DetalleFacturaRepository;
import com.ZYTRUST.Induccion.repositorios.FacturaRepository;
import com.ZYTRUST.Induccion.repositorios.ProductoRepository;
import com.ZYTRUST.Induccion.servicios.DetalleFacturaService;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    @Autowired
    private FacturaService facturaService;


    @Override
    public List<Detalle_Factura> ListarDetallesFacturas() {
        return detalleFacturaRepository.findAll();
    }

    @Override
    public Detalle_Factura CreateDetalleFactura(RegistrarDetalleFactura detalleFactura) {
        Detalle_Factura detalleFactura1= new Detalle_Factura();
        detalleFactura1.setFactura(facturaService.CreateFactura(detalleFactura.getFactura()));
        detalleFactura1.setProducto(productoRepository.findById(detalleFactura.getProductoId()).get());
        detalleFactura1.setCantidad(detalleFactura.getCantidad());
        return detalleFacturaRepository.save(detalleFactura1);
    }
}
