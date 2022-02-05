package com.ZYTRUST.Induccion.servicios;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente CreateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
