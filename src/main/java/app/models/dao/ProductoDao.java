package app.models.dao;

import app.models.entityProductos.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long > {
    
}
