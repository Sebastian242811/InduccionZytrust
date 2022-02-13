package com.ZYTRUST.Induccion.excepcion;

public class ExcepcionZyTrust extends RuntimeException{

    private CodigoError codigoError;

    public ExcepcionZyTrust(CodigoError codigoError){
        this.codigoError=codigoError;
    }
}
