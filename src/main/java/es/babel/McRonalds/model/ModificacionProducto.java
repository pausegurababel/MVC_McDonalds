package es.babel.McRonalds.model;

public class ModificacionProducto {

    private int cantidadModificar;

    private  Producto producto;

    public ModificacionProducto(){

    }

    public int getCantidadModificar() {
        return cantidadModificar;
    }

    public void setCantidadModificar(int cantidadModificar) {
        this.cantidadModificar = cantidadModificar;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
