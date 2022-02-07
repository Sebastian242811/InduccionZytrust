package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.DTO.RegistrarFactura;
import com.ZYTRUST.Induccion.modelos.Factura;
import com.ZYTRUST.Induccion.repositorios.ClienteRepository;
import com.ZYTRUST.Induccion.repositorios.FacturaRepository;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Factura CreateFactura(RegistrarFactura factura) {
        Factura facturaProvisional = new Factura();
        facturaProvisional.setId(factura.getId());
        facturaProvisional.setCliente(clienteRepository.findById(factura.getClienteId()).get());
        return facturaRepository.save(facturaProvisional);
    }

    @Override
    public List<Factura> ListFacturas() {
        return facturaRepository.findAll();
    }
}
