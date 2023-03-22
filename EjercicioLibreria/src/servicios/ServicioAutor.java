
package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import persistencia.AutorController;


public class ServicioAutor {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    AutorController AC = new AutorController();
    
    public void crearAutor(){
        
        Autor x = new Autor();
        
        x.setId((int)(Math.random()*Integer.MAX_VALUE+1));
        x.setAlta(true);
        
        
        boolean validar = false;
        do {
            System.out.println("Indica el nombre del Autor");
            String nombreAutor = leer.next();
            
            List<Autor> autor = AC.findName(nombreAutor);
            
            if (autor.isEmpty()) {
                x.setNombre(nombreAutor);
                validar = true;
            }else{
                System.out.println("El autor ya existe, ingrese otro nombre");
            }
            
        } while (validar != true);
        
        
        
        AC.crear(x);
    }
    
    public void borrarAutor(Autor x){
        AC.borrar(x.getId());
    }
    
    public void buscarAutor(String nombre){
        System.out.println(AC.findName(nombre));
    }
    
}
