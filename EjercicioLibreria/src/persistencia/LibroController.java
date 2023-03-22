
package persistencia;

import entidades.Libro;
import java.util.ArrayList;
import java.util.List;


public class LibroController  extends JPAController<Libro>{
    
    public LibroController(){
        super();
    }
    
    public void crear(Libro x){
        super.create(x);
    }
    
    public void editar(Libro x){
        super.update(x);
    }
    
    public void borrar(Long id){
        List<Libro> x = findId(id);
        if (x.isEmpty()) {
            System.out.println("No se encontro el libro");
        }else{
            super.delete(x.get(0));
            
        }
    }
    
    public List<Libro> findId(Long id){
        super.connect();
        List<Libro> x = em.createNamedQuery("Libro.findById", Libro.class).setParameter("id", id).getResultList();
        super.disconnect();
        return x;
    }
    
    public List<Libro> findByName(String nombre){
        super.connect();
        List<Libro> x = em.createNamedQuery("Libro.findByName", Libro.class).setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return x;
    }
    
    public List<Libro> findByAutorName(String nombre){
        super.connect();
        List<Libro> x = em.createNamedQuery("Libro.findByAutorName", Libro.class).setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return x;
    }
    
    public List<Libro> findByEditorialName(String nombre){
        super.connect();
        List<Libro> x = em.createNamedQuery("Libro.findByEditorialName", Libro.class).setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return x;
    }
}
