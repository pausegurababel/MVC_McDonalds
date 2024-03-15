package es.babel.McRonalds.controller;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.services.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final IPedidoService pedidoService;

    @Autowired
    public PedidoController(IPedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public void consultarPedidos(Model model) {
        List<Pedido> pedidos = pedidoService.consultarPedidos();
        model.addAttribute("pedidos", pedidos);
    }

    @PostMapping
    public void crearPedido(@RequestBody Pedido pedido, Model model) {
        pedidoService.crearPedido(pedido);
        model.addAttribute("mensaje", "Pedido creado correctamente");
    }

    @PutMapping("/{id}")
    public void actualizarPedido(@PathVariable int id, @RequestBody Pedido pedido, Model model) {
        pedido.setIdPedido(id); // Aseguramos que el pedido tenga el ID correcto
        pedidoService.actualizarPedido(pedido);
        model.addAttribute("mensaje", "Pedido actualizado correctamente");
    }

    @DeleteMapping("/{id}")
    public void cancelarPedido(@PathVariable int id, Model model) {
        pedidoService.cancelarPedido(id);
        model.addAttribute("mensaje", "Pedido cancelado correctamente");
    }
}
