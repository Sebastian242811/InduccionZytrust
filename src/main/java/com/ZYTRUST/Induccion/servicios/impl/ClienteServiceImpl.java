/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.servicios.impl;

import com.ZYTRUST.Induccion.modelos.Cliente;
import com.ZYTRUST.Induccion.repositorios.ClienteRepository;
import com.ZYTRUST.Induccion.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Esta clase representa la implementacion del Interface ClienteService
 * Debe usarse para añadir todas las implementaciones de las funciones relacionadas
 * con la tabla Cliente
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /**Dedicada a la implementacion de nuevos clientes*/
    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
