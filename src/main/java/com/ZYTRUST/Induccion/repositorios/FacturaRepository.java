/*
 * @(#)DetalleFactura.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.repositorios;

import com.ZYTRUST.Induccion.dto.MostrarFactura;
import com.ZYTRUST.Induccion.dto.MostrarFacturaClass;
import com.ZYTRUST.Induccion.dto.MostrarFacturaI;
import com.ZYTRUST.Induccion.modelos.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,String> {

    //Interfas
    @Query(value = "select f.id as id, c.nombre as nombreCliente, c.ruc as rucCliente,"
            +"f.fechaEmision as fechaEmision, f.fechaVencimiento as fechaVencimiento, f.estado as estado"
            +" from Factura f, Cliente c where f.cliente.id = c.id")
    List<MostrarFacturaI> listALLInter();

    //Clase
    @Query("select new com.ZYTRUST.Induccion.dto.MostrarFacturaClass(f.id,c.nombre, c.ruc ,f.fechaEmision, f.fechaVencimiento, f.estado) from Factura f, Cliente c where f.cliente.id = c.id")
    List<MostrarFacturaClass> listALLClas();
}
