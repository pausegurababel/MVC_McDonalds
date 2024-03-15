package es.babel.McRonalds.controller;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.model.Plantilla;
import es.babel.McRonalds.model.Trabajador;
import es.babel.McRonalds.services.IPlantillaService;
import es.babel.McRonalds.services.PlantillaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plantilla")
public class PlantillaController {
    private final IPlantillaService plantillaService;

    public PlantillaController(IPlantillaService plantillaService) {
        this.plantillaService = plantillaService;
    }

    @GetMapping
    public void Plantilla(Model model){
        model.addAttribute("plantilla", new Plantilla());
    }
    @PostMapping("/trabajador")
    public void altaTrabajador(@RequestBody Trabajador trabajador, Model model)throws Exception{
        plantillaService.altaTrabajador(trabajador);
        model.addAttribute("Trabajador", "Trabajador dado de alta");
    }

    @DeleteMapping("/trabajador")
    public void bajaTrabajador(@RequestBody Trabajador trabajador, Model model)throws Exception{
        plantillaService.bajaTrabajador(trabajador);
        model.addAttribute("Trabajador", "Trabajador dado de baja");

    }

    @GetMapping("/trabajador")
    public Plantilla getPlantilla(Model model){
        model.addAttribute("Plantilla","Plantilla");
        return plantillaService.getPlantilla();
    }

    @PostMapping("/trabajador/asignar-pedido")
    public void asignarPedido(@RequestBody Trabajador trabajador, Pedido pedido, Model model)throws Exception{
        plantillaService.asignacionPedido(trabajador, pedido);
        model.addAttribute("Pedido", "Pedido asignado");

    }

    @GetMapping("/alta")
    public String alta() {
        return "alta";
    }

    @GetMapping("/baja")
    public String baja() {
        return "baja";
    }

    @GetMapping("/asignacion")
    public String asignacion() {
        return "asignacion";
    }
}
