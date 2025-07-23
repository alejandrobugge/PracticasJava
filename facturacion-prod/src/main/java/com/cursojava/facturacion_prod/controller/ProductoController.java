package com.cursojava.facturacion_prod.controller;

import com.cursojava.facturacion_prod.dto.ProductoDTO;
import com.cursojava.facturacion_prod.model.Producto;
import com.cursojava.facturacion_prod.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
@Slf4j
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {

        this.productoService = productoService;

    }

    @PostMapping
    public ResponseEntity<ProductoDTO> save (@RequestBody ProductoDTO productoDTO){
        log.info("informacion de producto dado de alta: " + productoDTO.toString());
        return new ResponseEntity<>(productoService.save(productoDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> findAll(){
        List<ProductoDTO> productoDTOS = productoService.findAll();
        if(productoDTOS.isEmpty()){
            return ResponseEntity.noContent().build();

        }
        return ResponseEntity.ok(productoDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> findById (@PathVariable Integer id){
        return productoService.findById(id).map(
                ResponseEntity::ok
        ).orElseGet(()-> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByID(@PathVariable Integer id) {
        if(productoService.deleteById(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<ProductoDTO> update(@RequestBody ProductoDTO productoDTO){
        return productoService.update(productoDTO).map(
                ResponseEntity::ok
        ).orElseGet(
                ()-> ResponseEntity.notFound().build());
    }
}
