package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IPedidoService {


    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> consultarPedidos() {
        return pedidoRepository.findAll();
    }

    public void crearPedido(Pedido pedido) {
        pedidoRepository.save(pedido);

        // actualizar stock en almacen????
        //almacenService.actualizarStockDespuesDePedido(pedido);
    }

    public void actualizarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public void cancelarPedido(int idPedido) {
        pedidoRepository.deleteById(idPedido);
    }
}
