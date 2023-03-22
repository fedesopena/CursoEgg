/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Editorial;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import persistencia.EditorialController;

/**
 *
 * @author enano
 */
public class ServicioEditorial {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    EditorialController EC = new EditorialController();
    
    public void crearEditorial(){
        
        Editorial x = new Editorial();
        
        x.setId((int)(Math.random()*Integer.MAX_VALUE+1));
        x.setAlta(true);
        
        boolean validar = false;
        do {
            System.out.println("Ingrese el nombre de la Editorial");
            String nombreEditorial = leer.next();
            
            List<Editorial> editorial = EC.findName(nombreEditorial);
            
            if (editorial.isEmpty()) {
                x.setNombre(nombreEditorial);
                validar = true;
            }else{
                System.out.println("La Editorial ya existe, ingrese otro nombre");
            }
            
        } while (validar != true);
        
        EC.crear(x);
        
    }
    
    public void borrarEditorial(Editorial x){
        EC.borrar(x.getId());
    }
    
}
