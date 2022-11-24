// Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus  atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
// Generar un objeto puntos  usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en  los atributos del objeto.
// Después, a través de otro método calcular y devolver la distancia  que existe entre los dos puntos que existen en la clase Puntos.
package ejercicio2extra;

import ejercicio2extra.entidades.Puntos;
import ejercicio2extra.servicios.ServicioPuntos;


public class Ejercicio2EXTRA {

    
    public static void main(String[] args) {
        
        ServicioPuntos SP = new ServicioPuntos();
        
        Puntos P1 = SP.crearPujntos();
        
        System.out.println("Vamos a calcular la distancia entre los dos puntos");
        
        SP.calcularDistancia(P1.getX1(), P1.getY1(), P1.getX2(), P1.getY2());
        
        
        
    }
    
    
    
}
