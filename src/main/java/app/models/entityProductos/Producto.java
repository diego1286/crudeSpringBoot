package app.models.entityProductos;


import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
public class Producto  implements Serializable {
    private static final long serialVersionUID= -3351914884621648274L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
    @Column(name = "create_producto")
    @Temporal(TemporalType.DATE)
    private Date createPr;

    public Producto() {
    }

    public Producto(Long id, String nombre, Double precio, Date createPr) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.createPr = createPr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreatePr() {
        return createPr;
    }

    public void setCreatePr(Date createPr) {
        this.createPr = createPr;
    }
}
