package es.babel.McRonalds.services;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.model.Plantilla;
import es.babel.McRonalds.model.Trabajador;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PlantillaService implements IPlantillaService {

    private Plantilla plantilla;
    @Override
    public void altaTrabajador(Trabajador trabajador){
        if(plantilla.getListTrabajadores().contains(trabajador)){
            throw new IllegalArgumentException("El trabajador ya existe");
        }else{
            plantilla.getListTrabajadores().add(trabajador);
        }

    }

    @Override
    public void bajaTrabajador(Trabajador trabajador){
        if(!plantilla.getListTrabajadores().contains(trabajador)){
            throw new IllegalArgumentException("El trabajador no existe");
        }else {
            plantilla.getListTrabajadores().remove(trabajador);
        }
    }

    @Override
    public void asignacionPedido(Trabajador trabajador, Pedido pedido){
        if(!plantilla.getListTrabajadores().contains(trabajador)){
            throw new IllegalArgumentException("El trabajador no existe");
        }else {
            trabajador.setPedido(pedido);
        }
    }
}
