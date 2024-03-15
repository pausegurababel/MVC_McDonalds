package es.babel.McRonalds.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Data
@Table(name = "pedido")
public class Pedido implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idPedido;
    @ManyToMany(mappedBy = "pedidos")
    private Set<Producto> productos;

    public Pedido(){

    }
}
