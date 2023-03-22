
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAController <T> {
    
    protected EntityManagerFactory emf;
    protected EntityManager em;
    
    public JPAController(){
         emf = Persistence.createEntityManagerFactory("EjercicioLibreriaPU");
         em = emf.createEntityManager();
    }
    
    protected void connect(){
         if (!em.isOpen()) em = emf.createEntityManager();
    }
    
    protected void disconnect(){
        if (em.isOpen()) em.close(); 
    }
    
    protected void create (T object){
        connect();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        disconnect();
    }
    
    protected void update (T object){
        connect();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        disconnect();
    }
    
    protected void delete(T object){
        connect();
        em.getTransaction().begin();
        if (!em.contains(object)) {
            object = em.merge(object);
        }
        em.remove(object);
        em.getTransaction().commit();
        disconnect();
    }
    
}
