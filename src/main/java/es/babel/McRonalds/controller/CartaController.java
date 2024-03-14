package es.babel.McRonalds.controller;

import es.babel.McRonalds.model.Carta;
import es.babel.McRonalds.model.Producto;
import es.babel.McRonalds.services.CartaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carta")
public class CartaController {

    private CartaService cartaService;

    public CartaController(CartaService cartaService){
        this.cartaService = cartaService;
    }

    @GetMapping
    public List<Producto> getProductosCarta(Model model){
        model.addAttribute("productos", cartaService.obtenerTodosProductos());
        return cartaService.obtenerTodosProductos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@RequestParam("id") Integer id, Model model) {
        Producto producto = cartaService.obtenerProductoPorId(id);
        model.addAttribute("producto", producto);
        return producto;
    }

    @PostMapping("/agregar")
    public void agregarProducto(@ModelAttribute("producto") Producto producto, Model model) {
        cartaService.agregarProducto(producto);
        model.addAttribute("producto", producto);
    }

    @DeleteMapping("/eliminar")
    public void eliminarProducto(@ModelAttribute("id") int id, Model model) {
        cartaService.eliminarProducto(id);
        model.addAttribute("id", id);
    }
}
