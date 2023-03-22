package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({
    @NamedQuery(name="Autor.findById", query="Select a From Autor a Where a.id = :id"),
    @NamedQuery(name="Autor.findByName", query="Select a From Autor a Where a.nombre = :nombre"),
})


@Entity
public class Autor {
    
    @Id
    private Integer id;
    private String nombre;
    private boolean alta;

    public Autor() {
    }

    public Autor(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
    }
    
    
    
}
