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
import com.ZYTRUST.Induccion.dto.MostrarFacturaI;
import com.ZYTRUST.Induccion.dto.MostrarFacturaPorId;
import com.ZYTRUST.Induccion.modelos.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,String> {

    //Clase
    @Query("select new com.ZYTRUST.Induccion.dto.MostrarFactura(f.id,c.nombre, " +
            "c.ruc ,f.fechaEmision, f.fechaVencimiento, f.estado) from Factura f," +
            " Cliente c where f.cliente.id = c.id")
    List<MostrarFactura> listAll();

    @Query("select f.id as id, f.cliente.nombre as nombreCliente, f.cliente.ruc as rucCliente," +
            "f.fechaEmision as fechaEmision, f.fechaVencimiento as fechaVencimiento," +
            " f.estado as estado, f.detalles as detallesobj from Factura f where f.cliente.id = :id")
    MostrarFacturaPorId buscarFactura(@Param("id") String id);

}
