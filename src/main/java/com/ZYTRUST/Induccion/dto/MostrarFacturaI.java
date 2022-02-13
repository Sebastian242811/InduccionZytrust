package com.ZYTRUST.Induccion.dto;

import java.time.LocalDate;

public interface MostrarFacturaI {

    String getId();

    String getNombreCliente();

    String getRucCliente();

    LocalDate getFechaEmision();

    LocalDate getFechaVencimiento();

    String getEstado();
}
