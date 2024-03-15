package es.babel.McRonalds.controller;

import es.babel.McRonalds.model.Almacen;
import es.babel.McRonalds.model.ModificacionProducto;
import es.babel.McRonalds.model.Producto;
import es.babel.McRonalds.services.AlmacenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

    private AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService){
        this.almacenService = almacenService;
    }

    @GetMapping
    public void almacen(Model model){
        model.addAttribute("almacen", new Almacen());
    }
    @GetMapping("/lista")
    public Almacen listarAlmacen(Model model){
        Almacen almacen = this.almacenService.getAlmacen();
        model.addAttribute("almacen", almacen);
        return almacen;

    }
    @PostMapping("/productos")
    public String anadirNuevoProducto(@RequestParam(name = "nombre") String nombre,
                                 @RequestParam(name = "cantidad") int cantidad,
                                 Model model) {

        Producto producto = this.almacenService.crearProducto(nombre, cantidad);
        this.almacenService.anadirNuevoProductoAlmacen(producto);
        model.addAttribute("Producto", "Producto añadido");
        return "redirect:/almacen";

    }

    @PostMapping("/productos/anadir")
    public void anadirInventario(@RequestBody ModificacionProducto modificacionProducto, Model model){
        this.almacenService.modificarExistenciaProductoAlmacen(modificacionProducto);
        model.addAttribute("Producto", "Producto modificado");

    }
    @GetMapping("/formAlmacen")
    public String showFormAlmacen(Model model) {
        model.addAttribute("producto", new Producto());
        return "formAlmacen";
    }

}
