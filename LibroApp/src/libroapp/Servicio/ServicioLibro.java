
package libroapp.Servicio;

import java.util.Scanner;
import libroapp.entidades.Libro;


public class ServicioLibro {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        System.out.println("Ingrese el ISBN del libro");
        String ICBN = leer.next();
        
        System.out.println("Ingrese el titulo del libro");
        String Titulo = leer.next();
        
        System.out.println("Ingrese el nombre del Autor del libro");
        String Autor = leer.next();
        
        System.out.println("Ingrese el numero de pagintas que tiene el libro");
        String Paginas = leer.next();
        
        return new Libro(ICBN,Titulo,Autor,Paginas);
        
    }
    
}
