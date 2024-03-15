package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.model.Plantilla;
import es.babel.McRonalds.model.Trabajador;


public interface IPlantillaService {

    void altaTrabajador(Trabajador trabajador) throws Exception;
    void bajaTrabajador(Trabajador trabajador) throws Exception;
    void asignacionPedido(Trabajador trabajador, Pedido pedido) throws Exception;
    Trabajador crearTrabajador(int id, String name);
}
