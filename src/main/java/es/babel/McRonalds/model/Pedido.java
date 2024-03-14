package es.babel.McRonalds.model;

import lombok.Data;

import java.util.List;

@Data
public class Pedido {
    private List<Producto> listProductos;
}
