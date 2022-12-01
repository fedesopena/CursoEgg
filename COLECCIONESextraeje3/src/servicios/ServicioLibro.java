
package servicios;

import entidades.Libro;
import java.util.Scanner;


public class ServicioLibro {
    
    public Libro crearLibro(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();
        
        System.out.println("Ingrese la cantidad de ejemplares");
        Integer numeroEjemplares = leer.nextInt();
        
        return new Libro(titulo, autor, numeroEjemplares);
    }
    
    
    
}
