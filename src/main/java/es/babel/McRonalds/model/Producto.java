package es.babel.McRonalds.model;


import jakarta.persistence.*;

@Table(name= "producto")
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cantidad")
    private int cantidad;


    public Producto(){
    }

    public Producto(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
