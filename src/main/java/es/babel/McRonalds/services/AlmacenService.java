package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Almacen;
import es.babel.McRonalds.model.ModificacionProducto;
import es.babel.McRonalds.model.Producto;
import es.babel.McRonalds.repository.ProductoRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class AlmacenService implements  IAlmacenService {

    @Getter
    private Almacen almacen;

    private final ProductoRepository productoRepository;

    public AlmacenService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
        this.almacen = new Almacen();
    }

    @Override
    public void anadirNuevoProductoAlmacen(Producto producto){
        HashMap<Integer, Producto> mapProductos = this.almacen.getMapProductos();
        this.almacen.anadirProducto(producto);
    }

    @Override
    public void modificarExistenciaProductoAlmacen(Producto producto){
    HashMap<Integer, Producto> mapProductos = this.almacen.getMapProductos();
    Producto productoExistente = mapProductos.get(producto.getId());
    productoExistente.setCantidad(producto.getCantidad());
    actualizarRepositoryProducto(producto);

    }


    @Override
    public Producto crearProducto(String nombre, int cantidad){
        Producto producto = new Producto(nombre,cantidad);
        this.productoRepository.save(producto);
        return producto;
    }



    private void actualizarRepositoryProducto(Producto producto){
        Producto productoExistente = productoRepository.findById(producto.getId()).orElse(null);
        if (productoExistente != null){
            productoRepository.save(producto);
        }
    }


}
