package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Almacen;
import es.babel.McRonalds.model.ModificacionProducto;
import es.babel.McRonalds.model.Producto;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AlmacenService {

    private Almacen almacen;

    public AlmacenService(){
        this.almacen = new Almacen();
    }

    public Almacen getAlmacen(){
        return almacen;
    }

    public void anadirNuevoProductoAlmacen(Producto producto){
        HashMap<Integer, Producto> mapProductos = this.almacen.getMapProductos();
        this.almacen.anadirProducto(producto);
    }

    public void modificarExistenciaProductoAlmacen(ModificacionProducto modificacionProducto){
    HashMap<Integer, Producto> mapProductos = this.almacen.getMapProductos();
    Producto productoExistente = mapProductos.get(modificacionProducto.getProducto().getIdProducto());
    productoExistente.setCantidad(modificacionProducto.getProducto().getCantidad() + modificacionProducto.getCantidadModificar());
    }


    public Producto crearProducto(String nombre, int cantidad){
        return new Producto(nombre,cantidad);
    }


}
