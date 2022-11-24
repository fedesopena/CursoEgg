
package ej12poo.servicios;

import ej12poo.entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class ServicioPersona {
    
    public Persona crearPersona(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        
        System.out.println("Que dia del mes nacio?");
        int dia = leer.nextInt();
        
        System.out.println("Que mes nacio?");
        int mes = leer.nextInt();
        mes -= 1;
        
        System.out.println("Que año nacio?");
        int anio = leer.nextInt();
        anio -= 1900;
        
        Date nacimiento = new Date(anio,mes,dia);
        
        return new Persona(nombre, nacimiento);
    }
    
    public void calcularEdad(Date nacimiento){
        
        Date fechaActual = new Date();
        
        int anios = fechaActual.getYear() - nacimiento.getYear();
        
        System.out.println("La edad de la persona es de "+anios+ " años");
        
    }
    
    public boolean menorQue(int edad, int edad2){
        
       
        return edad2 < edad;
    }
    
    public void mostrarPersona(Persona x){
        
        System.out.println(x);
        
    }
}
