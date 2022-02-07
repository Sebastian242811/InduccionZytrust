package com.ZYTRUST.Induccion.DTO;

import com.ZYTRUST.Induccion.modelos.Cliente;
import lombok.Data;


@Data
public class MostrarCliente {

    private String nombre;

    private String RUC;

    public MostrarCliente(Cliente cliente){
        setNombre(cliente.getNombre());
        setRUC(cliente.getRUC());
    }

}
