package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Producto;

import java.util.List;

public interface ICartaService {
    List<Producto> obtenerTodosProductos();
    Producto obtenerProductoPorId(int id);
    void agregarProducto(Producto producto);
    void actualizarProducto(int id, Producto producto);
    void eliminarProducto(int id);
}
