package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.repositorios.ClienteRepository;
import com.ZYTRUST.Induccion.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente CreateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
