
package ejercicioextra5;

import ejercicioextra5.entidades.Meses;
import java.util.Scanner;


public class EjercicioEXTRA5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Meses x = new Meses();
        
        System.out.println("ADIVINA EL MES SECRETO");
        
        boolean ganaste = false;
        String intento;
        
        do {
            
            System.out.println("Ingrese un mes");
            intento = leer.next();
            intento = intento.toLowerCase();
            
            if (intento.equals(x.getMesSecreto()) ) {
                System.out.println("FELICIDADES, ACERTASTE EL MES");
                ganaste = true;
            }else{
                System.out.println("INCORRECTO, VUELVE A INTENTARLO");
                
            }
            
            
        } while (ganaste == false);
        
        
    }
    
}
