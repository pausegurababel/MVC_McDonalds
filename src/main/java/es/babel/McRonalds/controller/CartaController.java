package es.babel.McRonalds.controller;

import es.babel.McRonalds.model.Carta;
import es.babel.McRonalds.model.Producto;
import es.babel.McRonalds.services.CartaService;
import es.babel.McRonalds.services.ICartaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carta")
public class CartaController {

    private final ICartaService cartaService;

    public CartaController(ICartaService cartaService){
        this.cartaService = cartaService;
    }

    @GetMapping
    public void getCarta(Model model){
        model.addAttribute("carta", cartaService);
    }

    @GetMapping("/productos")
    public List<Producto> getProductosCarta(Model model){
        model.addAttribute("productos", "productos");
        return cartaService.obtenerTodosProductos();
    }

    @GetMapping("/productos/{id}")
    public Producto obtenerProductoPorId(@RequestParam("id") Integer id, Model model) {
        Producto producto = cartaService.obtenerProductoPorId(id);
        model.addAttribute("producto", producto);
        return producto;
    }

    @PostMapping("/productos/agregar")
    public void agregarProducto(@ModelAttribute("producto") Producto producto, Model model) {
        cartaService.agregarProducto(producto);
        model.addAttribute("producto", "producto agregado");
    }

    @DeleteMapping("/productos/eliminar")
    public void eliminarProducto(@ModelAttribute("id") int id, Model model) {
        cartaService.eliminarProducto(id);
        model.addAttribute("producto", "producto eliminado");
    }
}
