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

import com.ZYTRUST.Induccion.dto.MostrarProducto;
import com.ZYTRUST.Induccion.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,String> {

    @Query(value = "select p.nombre as nombre, p.descripcion as descripcion, " +
                    "p.precio as precio from Producto p")
    List<MostrarProducto> listarProductos();
}
