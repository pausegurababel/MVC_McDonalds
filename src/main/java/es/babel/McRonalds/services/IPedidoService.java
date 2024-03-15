package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Pedido;

import java.util.List;

public interface IPedidoService {

    List<Pedido> consultarPedidos();
    void crearPedido(Pedido pedido);
    void actualizarPedido(Pedido pedido);
    void cancelarPedido(int idPedido);
}
