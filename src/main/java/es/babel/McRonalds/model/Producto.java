package es.babel.McRonalds.model;

public class Producto {

    private static int contadorId = 0;

    private int id;

    private String nombre;

    private int cantidad;

    public Producto(String nombre, int cantidad){
        this.id = contadorId++;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getId() {
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
