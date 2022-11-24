package libroapp;

import libroapp.Servicio.ServicioLibro;
import libroapp.entidades.Libro;


public class LibroApp1 {

    public static void main(String[] args) {
        
        ServicioLibro sl = new ServicioLibro();
        
        System.out.println("Vamos a cargar un libro a la base de datos");
        
        Libro l1 = sl.crearLibro();
        
        System.out.println(l1);
        
    }
    
}
