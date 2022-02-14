package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.dto.MostrarProducto;
import com.ZYTRUST.Induccion.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<MostrarProducto> listarProductos(){
        return productoService.listarProductos();
    }
}
