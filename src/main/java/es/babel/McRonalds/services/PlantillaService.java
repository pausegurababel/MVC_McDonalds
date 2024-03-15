package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.model.Plantilla;
import es.babel.McRonalds.model.Trabajador;
import es.babel.McRonalds.repository.PlantillaRepository;
import es.babel.McRonalds.repository.ProductoRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PlantillaService implements IPlantillaService {

    private PlantillaRepository plantillaRepository;

    public PlantillaService(PlantillaRepository plantillaRepository){
        this.plantillaRepository = plantillaRepository;
    }

    @Override
    public void altaTrabajador(Trabajador trabajador){
        plantillaRepository.save(trabajador);
    }

    @Override
    public void bajaTrabajador(Trabajador trabajador){
        plantillaRepository.delete(trabajador);
    }

    @Override
    public void asignacionPedido(Trabajador trabajador, Pedido pedido){
        trabajador.setPedido(pedido);
    }

    @Override
    public Trabajador crearTrabajador(int id, String name) { return new Trabajador(id, name);}


}
