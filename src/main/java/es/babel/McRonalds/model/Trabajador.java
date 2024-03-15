package es.babel.McRonalds.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "trabajador")
@Entity
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pedido")
    private Pedido pedido;
}
