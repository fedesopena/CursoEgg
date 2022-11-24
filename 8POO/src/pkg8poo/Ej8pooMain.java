
package pkg8poo;

import java.util.Scanner;
import pkg8poo.entidades.Cadena;
import pkg8poo.servicios.ServicioCadena;


public class Ej8pooMain {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCadena SC = new ServicioCadena();
        Cadena cadena1 = SC.crearCadena();
        
        cadena1.setLongitud(cadena1.getFrase().length());
        
        SC.mostrarVocales(cadena1.getFrase());
        
        SC.invertirFrase(cadena1.getFrase());
        
        System.out.println("Ingrese una letra a buscar en la frase");
        
        SC.vecesRepetido(cadena1.getFrase(), leer.next());
        
        System.out.println("Ingrese una nueva frase");
        
        SC.compararLongitud(cadena1.getFrase(), leer.next());
        
        System.out.println("Ingrese, nuevamente, otra frase");
        
        SC.unirFrase(cadena1.getFrase(), leer.next());
        
        System.out.println("Ingrese una letra para reemplazar la letra 'a' en la frase original");
        
        SC.reemplazar(cadena1.getFrase(), leer.next());
        
        System.out.println("Ingrese otra letra a buscar en la frase original");
        
        SC.contiene(cadena1.getFrase(), leer.next());
    }
}
