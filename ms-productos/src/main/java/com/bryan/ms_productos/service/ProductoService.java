package com.bryan.ms_productos.service;

import com.bryan.ms_productos.entity.Producto;
import org.springframework.stereotype.Service;
import com.bryan.ms_productos.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    // 👇 Este es el método que te falta
    public List<Producto> obtenerTodos() {
        return repository.findAll();
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
