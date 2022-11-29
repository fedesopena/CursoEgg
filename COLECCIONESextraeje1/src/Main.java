
import java.util.ArrayList;
import java.util.Scanner;

/*
    Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
    y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
    introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
    programa mostrará por pantalla el número de valores que se han leído, su suma y su
    media (promedio)
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Integer> numeros = new ArrayList();
        
        Integer num = 0;
        
        do {
            
            System.out.println("Ingresa un numero a la lista (-99 para terminar el bucle)");
            num = leer.nextInt();
            if (num != -99) {
                numeros.add(num);            
            }
            
        } while (num != -99);
        
        
        System.out.println("LISTA DE NUEMEROS");
        for (Integer n : numeros) {
            System.out.print("["+n+"]");
        }
        System.out.println("");
        
        System.out.println("SUMA DE TODOS LOS NUMEROS");
        Integer suma = 0;
        for (Integer n : numeros) {
            suma += n;
        }
        System.out.println(suma);
        
        System.out.println("PROMEDIO DE LOS NUMEROS");
        Integer promedio = 0;
        Integer contador = 0;
        for (Integer n : numeros) {
            promedio += n;
            contador++;
        }
        System.out.println(promedio/contador);
        
    }
    
}
