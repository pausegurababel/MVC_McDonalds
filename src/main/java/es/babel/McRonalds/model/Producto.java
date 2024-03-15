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
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToMany(mappedBy = "carta")
    private Set<Carta> carta;

    @ManyToMany(mappedBy = "productos")
    private Set<Pedido> pedidos;


    public Producto(){
    }

    public Producto(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


}
