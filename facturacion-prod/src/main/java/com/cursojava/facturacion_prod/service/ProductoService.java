package com.cursojava.facturacion_prod.service;

import com.cursojava.facturacion_prod.dto.ProductoDTO;
import com.cursojava.facturacion_prod.model.Producto;
import com.cursojava.facturacion_prod.repository.ProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
    private final ModelMapper modelMapper;

    public ProductoService(ProductoRepository productoRepository, ModelMapper modelMapper) {
        this.productoRepository = productoRepository;
        this.modelMapper = modelMapper;
    }

    //save
    public ProductoDTO save(ProductoDTO productoDTO){

        Producto producto = modelMapper.map(productoDTO, Producto.class);
        return modelMapper.map(productoRepository.save(producto), ProductoDTO.class);

    }
    //find all
    public List<ProductoDTO> findAll(){
        return productoRepository.findAll().stream().map(
                producto -> {
                    return modelMapper.map(producto, ProductoDTO.class);
                }
        ).collect(Collectors.toList());
    }

    //find by id
    public Optional<ProductoDTO> findById(Integer id){
        return productoRepository.findById(id).map(
                producto -> {
                    return modelMapper.map(producto,ProductoDTO.class);
                }
        );
    }

    //delete by id

    public boolean deleteById(Integer id){
        return productoRepository.findById(id).map(
                producto -> {
                    productoRepository.delete(producto);
                    return true;
                }
        ).orElse(false);
    }

    //update
    public Optional<ProductoDTO> update(ProductoDTO productoDTO){
        Producto producto = modelMapper.map(productoDTO,Producto.class);

        return productoRepository.findById(producto.getId()).map(
                productoDB -> {
                    return modelMapper.map(productoRepository.save(producto),ProductoDTO.class);
                }
        );
    }

}
