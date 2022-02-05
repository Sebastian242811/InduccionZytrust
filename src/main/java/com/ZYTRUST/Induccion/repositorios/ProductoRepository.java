package com.ZYTRUST.Induccion.repositorios;

import com.ZYTRUST.Induccion.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,String> {
}
