/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Editorial;
import java.util.List;

/**
 *
 * @author enano
 */
public class EditorialController extends JPAController<Editorial> {
    
    public EditorialController(){
        super();
    }
    
    public void crear(Editorial x){
        super.create(x);
    }
    
    public void editar(Editorial x){
        super.update(x);
    }
    
    public void borrar(Integer id){
        Editorial x = findId(id);
        super.delete(x);
    }
    
    public Editorial findId(Integer id){
        super.connect();
        Editorial x = em.createNamedQuery("Editorial.findById", Editorial.class).setParameter("id", id).getSingleResult();
        super.disconnect();
        return x;
    }
    
    public List<Editorial> findName(String nombre){
        super.connect();
        List<Editorial> x = em.createNamedQuery("Editorial.findByName", Editorial.class).setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return x;
    }
    
}
