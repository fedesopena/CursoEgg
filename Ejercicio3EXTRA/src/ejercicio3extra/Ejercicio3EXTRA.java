package ejercicio3extra;

import ejercicio3extra.entidades.Raices;
import ejercicio3extra.servicios.ServicioRaices;
import java.util.Scanner;


public class Ejercicio3EXTRA {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioRaices SR = new ServicioRaices();
        
        Raices R1 = SR.crearRaices();
        
        SR.getDiscriminante(R1);
        
        System.out.println(SR.tieneRaices(R1));
        
        SR.obtenerRaices(R1);
        SR.obtenerRaiz(R1);
        
        System.out.println("");
        SR.calcular(R1);
        
    }
    
}
