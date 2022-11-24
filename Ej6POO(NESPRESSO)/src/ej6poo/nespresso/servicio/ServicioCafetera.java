
package ej6poo.nespresso.servicio;

import ej6poo.nespresso.entidades.Cafetera;
import java.util.Scanner;


public class ServicioCafetera {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
    
        System.out.println("Vamos a comprar una Cafetera Nespresso personalizada");
        System.out.println("Ingrese la cantidad maxima de cafe deseada que pueda contener la cafetara");
        int capacidad = leer.nextInt();
        
        return new Cafetera(capacidad,0);
        
}
    
}
