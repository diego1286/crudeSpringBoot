package app.services;

import app.models.entityProductos.Producto;

import java.util.List;
import java.util.Optional;


public interface IProductSerevice {

   public  List<Producto>  findAll();
     public Optional<Producto> finById(Long id);

    Producto save(Producto producto);
}
