package es.babel.McRonalds.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "carta")
public class Carta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carta")
    private int idCarta;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany
    private Set<Producto> productos;

    // Constructor, getters y setters
}
