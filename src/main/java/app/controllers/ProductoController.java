package app.controllers;

import app.models.entityProductos.Producto;
import app.services.IProductSerevice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    @Autowired
    private IProductSerevice productSerevice;

    @PostMapping("/productos")
    public ResponseEntity<Producto> createProduct(@RequestBody Producto producto) {
        try {
            Producto productoCreado = productSerevice.save(producto);
            return new ResponseEntity<>(productoCreado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return  productSerevice.findAll();
    }
    @GetMapping( "/producto/{id}")
    public Optional<Producto> getProductById(@PathVariable Long id){
        return  productSerevice.finById(id);
    }

}
