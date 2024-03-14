package es.babel.McRonalds.model;


import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> listProductos;

    public Almacen(){
        this.listProductos = new ArrayList<>();
    }

    public List<Producto> getListProductos(){
        return listProductos;
    }

    public void anadirListProductos(Producto producto){
        this.listProductos.add(producto);
    }


}
