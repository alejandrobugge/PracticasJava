package com.cursojava.facturacion_prod.repository;

import com.cursojava.facturacion_prod.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}
