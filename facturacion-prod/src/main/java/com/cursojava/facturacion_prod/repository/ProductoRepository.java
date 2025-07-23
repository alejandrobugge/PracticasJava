package com.cursojava.facturacion_prod.repository;

import com.cursojava.facturacion_prod.model.Producto;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
