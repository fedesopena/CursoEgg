package Servicios;

import entidades.PELICULA;
import java.util.Scanner;


public class ServicioPelicula {
    
    public PELICULA crearPelicula(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo = leer.next();
        
        System.out.println("Ingrese el nombre del Director de la pelicula: ");
        String director = leer.next();
        
        System.out.println("Ingrese la duracion de la pelicula en minutos: ");
        Integer duracion = leer.nextInt();
        
        return new PELICULA(titulo, director, duracion);
    }
    
}
