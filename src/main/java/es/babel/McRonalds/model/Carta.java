package es.babel.McRonalds.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "carta")
public class Carta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToMany(mappedBy = "carta")
    private Set<Producto> carta;

    // Constructor, getters y setters
}
