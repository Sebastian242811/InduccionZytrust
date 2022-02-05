package com.ZYTRUST.Induccion.repositorios;

import com.ZYTRUST.Induccion.modelos.Detalle_Factura;
import com.ZYTRUST.Induccion.modelos.Detalle_FacturaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends JpaRepository<Detalle_Factura, Detalle_FacturaId> {
}
