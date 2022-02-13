package com.ZYTRUST.Induccion.controladores;

import com.ZYTRUST.Induccion.dto.MostrarCliente;
import com.ZYTRUST.Induccion.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<MostrarCliente> listarClientes(){
        return clienteService.listarCliente();
    }
}
