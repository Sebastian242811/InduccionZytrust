package com.ZYTRUST.Induccion.excepcion;

public enum CodigoError {

    CLIENTE_NO_EXISTE("El cliente solicitado no ha sido encontrado"),
    FECHA_NO_VALIDA("La fecha ingresada debe ser posterior a la fecha actual"),
    PRODUCTO_NO_ENCONTRADO("El producto con el identificador ingresado no existe");

    private final String descripcion;

    CodigoError(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
