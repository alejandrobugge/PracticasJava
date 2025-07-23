package com.cursojava.facturacion_prod.dto;

import jakarta.persistence.Transient;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class ResponseFacturaDTO {
    private Integer Id;
    private String numeroFactura;
    private BigDecimal subTotal;
    private BigDecimal total;
    private LocalDateTime fechaCreado;

    private Set<ResponseDetalleFacturaDTO> detalleFacturas;

}
