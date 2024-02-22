package app.services.impl;

import app.models.dao.ProductoDao;
import app.models.entityProductos.Producto;
import app.services.IProductSerevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl  implements IProductSerevice {

    @Autowired
     private ProductoDao productoDao;
    @Override
    @Transactional(readOnly= true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();// se debe convertir en un lista de iterable
    }

    @Override
    @Transactional(readOnly= true)
    public Optional<Producto> finById(Long id) {
        return productoDao.findById(id);
    }

    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }
}
