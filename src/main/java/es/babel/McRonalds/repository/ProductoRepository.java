package es.babel.McRonalds.repository;

import es.babel.McRonalds.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Aquí puedes añadir métodos adicionales de consulta si es necesario
}
