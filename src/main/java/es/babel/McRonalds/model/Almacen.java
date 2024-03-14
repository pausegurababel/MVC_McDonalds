package es.babel.McRonalds.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Almacen {

    private HashMap<Integer, Producto> mapProductos;

    public Almacen(){
        this.mapProductos = new HashMap<>();
    }

    public HashMap<Integer, Producto> getMapProductos(){
        return mapProductos;
    }

    public void anadirProducto(Producto producto){
        this.mapProductos.put(producto.getId(), producto);
    }


}
