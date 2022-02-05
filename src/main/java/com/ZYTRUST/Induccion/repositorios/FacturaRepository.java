package com.ZYTRUST.Induccion.repositorios;

import com.ZYTRUST.Induccion.modelos.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,String> {
}
