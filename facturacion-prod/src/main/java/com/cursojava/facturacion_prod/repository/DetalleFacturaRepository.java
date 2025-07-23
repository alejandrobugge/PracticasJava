package com.cursojava.facturacion_prod.repository;

import com.cursojava.facturacion_prod.model.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {
}
