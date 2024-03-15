package es.babel.McRonalds.model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Table(name= "producto")
@Entity
@Data
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToMany
    private Set<Carta> carta;

    @ManyToMany
    private Set<Pedido> pedidos;


    public Producto(){
    }

    public Producto(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


}
