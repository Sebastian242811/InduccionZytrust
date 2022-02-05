package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.DTO.MostrarFactura;
import com.ZYTRUST.Induccion.DTO.RegistrarFactura;
import com.ZYTRUST.Induccion.modelos.Factura;
import com.ZYTRUST.Induccion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping()
    public List<MostrarFactura> ListarFacturas(){
        return facturaService.ListFacturas().stream().map(MostrarFactura::new).collect(Collectors.toList());
    }

    @PostMapping()
    public Factura CreateFactura(@RequestBody() RegistrarFactura registrarFactura){
        return facturaService.CreateFactura(registrarFactura);
    }
}
