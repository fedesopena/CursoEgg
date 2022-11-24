
package ej2poo.service;

import ej2poo.entidades.Circunferencia;
import java.util.Scanner;


public class Servicio {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
        
    }
    

 
    
}
