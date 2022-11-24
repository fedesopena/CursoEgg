
import Servicios.ServicioPelicula;
import entidades.PELICULA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class MAIN4 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPelicula SP = new ServicioPelicula();
        
        ArrayList<PELICULA> ListaPeliculas = new ArrayList();
        
        System.out.println("VAMOS A AGREGAR PELICULAS A LA LISTA");
        boolean crear = true;
        
        do {
            ListaPeliculas.add(SP.crearPelicula());
            System.out.println("Desea agregar otra pelicula? S/N");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("N")) {
                crear = false;
            }
            
        } while (crear != false);
        
        System.out.println("");
        System.out.println("TODAS LAS PELICULAS");
        for (PELICULA aux : ListaPeliculas) {
            System.out.println(aux.toString());
            
        }
        
        System.out.println("");
        System.out.println("TODAS LAS PELICULAS CON DURACION MAYOR A UNA HORA");
        for (PELICULA aux : ListaPeliculas) {
            if (aux.getHoras() > 0 ) {
                System.out.println(aux.toString());
            }
            
        }
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE ACUERDO A LA DURACION(MAYOR A MENOR)");
        Collections.sort(ListaPeliculas, Comparadores.ordenDuracionAscendente);
        for (PELICULA aux : ListaPeliculas) {
            System.out.println(aux.toString());
            
        }
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE ACUERDO A LA DURACION(MENOR A MAYOR)");
        Collections.sort(ListaPeliculas, Comparadores.ordenDuracionDescendente);
        for (PELICULA aux : ListaPeliculas) {
            System.out.println(aux.toString());
            
        }
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE ACUERDO AL TITULO (ALFABETICAMENTE)");
        Collections.sort(ListaPeliculas, Comparadores.ordenTitulo);
        for (PELICULA aux : ListaPeliculas) {
            System.out.println(aux.toString());
            
        }
        
        System.out.println("");
        System.out.println("LISTA ORDENADA DE ACUERDO AL DIRECTOR (ALFABETICAMENTE)");
        Collections.sort(ListaPeliculas, Comparadores.ordenDirector);
        for (PELICULA aux : ListaPeliculas) {
            System.out.println(aux.toString());
            
        }
        
    }
    
}
