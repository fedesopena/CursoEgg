/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Autor;
import java.util.List;


public class AutorController extends JPAController<Autor> {
    
    public AutorController(){
        super();
    }
    
    public void crear(Autor x){
        super.create(x);
    }
    
    public void editar(Autor x){
        super.update(x);
    }
    
    public void borrar(Integer id){
        Autor x = findId(id);
        super.delete(x);
    }
    
    public Autor findId(Integer id){
        super.connect();
        Autor x = em.createNamedQuery("Autor.findById", Autor.class).setParameter("id", id).getSingleResult();
        super.disconnect();
        return x;
    }
    
    public List<Autor> findName(String nombre){
        super.connect();
        List <Autor> x = em.createNamedQuery("Autor.findByName", Autor.class).setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return x;
    }
    
}
