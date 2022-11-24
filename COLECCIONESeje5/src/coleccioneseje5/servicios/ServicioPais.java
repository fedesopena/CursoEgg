
package coleccioneseje5.servicios;

import coleccioneseje5.entidades.Pais;
import java.util.Scanner;


public class ServicioPais {
    
     public Pais crearPais(){
         
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingrese el nombre de un pais");
         String nombre = leer.next();
         
         return new Pais(nombre);
         
     }
    
}
