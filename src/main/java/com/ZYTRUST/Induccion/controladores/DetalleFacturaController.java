package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.DTO.MostrarDetalleFactura;
import com.ZYTRUST.Induccion.DTO.MostrarFacturaenDetalle;
import com.ZYTRUST.Induccion.DTO.RegistrarDetalleFactura;
import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.servicios.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/factura/detalles")
public class DetalleFacturaController {

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    @GetMapping
    public List<Detalle_Factura> ListarDetalles(){
        return detalleFacturaService.ListarDetallesFacturas();
    }

    @PostMapping
    public MostrarDetalleFactura CrearDetalle(@RequestBody RegistrarDetalleFactura registrarDetalleFactura){
        return new MostrarDetalleFactura(detalleFacturaService.CreateDetalleFactura(registrarDetalleFactura));
    }
}
