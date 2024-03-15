package es.babel.McRonalds.repository;

import es.babel.McRonalds.model.Pedido;
import es.babel.McRonalds.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
