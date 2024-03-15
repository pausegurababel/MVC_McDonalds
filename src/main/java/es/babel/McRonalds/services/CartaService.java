package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Carta;
import es.babel.McRonalds.model.ModificacionProducto;
import es.babel.McRonalds.model.Producto;
import es.babel.McRonalds.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CartaService implements  ICartaService{

    private final ProductoRepository productoRepository;

    public CartaService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public void agregarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    public void actualizarProducto(int id, Producto producto) {
        Producto productoExistente = productoRepository.findById(id).orElse(null);
        if (productoExistente != null) {
            productoRepository.save(producto);
        }
    }

    public void eliminarProducto(int id) {
        productoRepository.deleteById(id);
    }





}
