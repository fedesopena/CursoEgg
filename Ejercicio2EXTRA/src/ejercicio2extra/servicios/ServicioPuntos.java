
package ejercicio2extra.servicios;

import ejercicio2extra.entidades.Puntos;
import java.util.Scanner;


public class ServicioPuntos {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPujntos(){
        
        System.out.println("Ingrese dos numeros enteros para las coordenadas x");
        System.out.print("X1= " );
        int x1 = leer.nextInt();
        System.out.println("");
        
        System.out.print("X2= ");
        int x2 = leer.nextInt();
        System.out.println("");
        
        System.out.println("Ingrese dos numeros enteros para las coordenadas y");
        System.out.print("Y1= " );
        int y1 = leer.nextInt();
        System.out.println("");
        
        System.out.print("Y2= ");
        int y2 = leer.nextInt();
        System.out.println("");
        
        return new Puntos(x1, x2, y1, y2);
        
    }
    
    public void calcularDistancia(int x1, int y1, int x2, int y2){
        
        double distancia = Math.pow(((double)x2 - x1), 2) + Math.pow(((double)y2 - y1), 2);
        
        distancia = Math.sqrt(distancia);
        
        System.out.println("La distancia entre los puntos es: "+ distancia);
        
    }
    
    
    
    
    
}
