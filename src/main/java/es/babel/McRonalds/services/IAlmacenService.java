package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Almacen;
import es.babel.McRonalds.model.Producto;

public interface IAlmacenService {

    void anadirNuevoProductoAlmacen(Producto producto);
    void modificarExistenciaProductoAlmacen(Producto producto);

    Producto crearProducto(String nombre, int cantidad);

    Almacen getAlmacen();
}
