package ej12poo;

import ej12poo.entidades.Persona;
import ej12poo.servicios.ServicioPersona;
import java.util.Scanner;


public class EJ12POO {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPersona SP = new ServicioPersona();
        
        Persona persona1 = SP.crearPersona();
        
        SP.calcularEdad(persona1.getNacimiento());
        
        System.out.println("Ingrese una edad para comparar");
        
        boolean mayor = SP.menorQue(persona1.getNacimiento().getYear(), leer.nextInt());
        System.out.println(mayor);
        
        SP.mostrarPersona(persona1);
    }
    
}
