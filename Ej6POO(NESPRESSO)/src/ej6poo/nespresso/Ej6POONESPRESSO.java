package ej6poo.nespresso;

import ej6poo.nespresso.servicio.ServicioCafetera;
import java.util.Scanner;
import ej6poo.nespresso.entidades.Cafetera;


public class Ej6POONESPRESSO {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCafetera SC = new ServicioCafetera();
        
        System.out.println("Queres comprar una cafetera basica o la queres personalizada? (b/p)");
        String respuesta = leer.next();
        respuesta = respuesta.toLowerCase();
        
        if (respuesta.equals("b")){
            Cafetera CafBasica = new Cafetera();
            System.out.println("Compraste la cafetera basica, con un maximo de capacidad de 10");
            CafBasica.llenarCafetera();
            System.out.println("Ingrese el tamaño de la taza para servir cafe");
            int taza = leer.nextInt();
            CafBasica.servirTaza(taza);
            
            System.out.println("Capacidad actual de la cafetera: "+ CafBasica.getCapacidadActual());
            System.out.println("");
            System.out.println("Ingrese cantidad de cafe para agregar a la cafetera");
            int cafe = leer.nextInt();
            CafBasica.agregarCafe(cafe);
            
            System.out.println("Capacidad actual de la cafetera: "+ CafBasica.getCapacidadActual());
            System.out.println("");
            
            CafBasica.vaciarCafetera();
            
        }else{
            Cafetera CafPersonal = SC.crearCafetera();
            CafPersonal.llenarCafetera();
            System.out.println("Ingrese el tamaño de la taza para servir cafe");
            int taza = leer.nextInt();
            CafPersonal.servirTaza(taza);
            
            System.out.println("Capacidad actual de la cafetera: "+ CafPersonal.getCapacidadActual());
            System.out.println("");
            System.out.println("Ingrese cantidad de cafe para agregar a la cafetera");
            int cafe = leer.nextInt();
            CafPersonal.agregarCafe(cafe);
            
            System.out.println("Capacidad actual de la cafetera: "+ CafPersonal.getCapacidadActual());
            System.out.println("");
            
            CafPersonal.vaciarCafetera();
        }
        
        
        
        
    }
    
}
