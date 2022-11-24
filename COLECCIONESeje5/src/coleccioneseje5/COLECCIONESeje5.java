/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.


*/

package coleccioneseje5;

import coleccioneseje5.entidades.Pais;
import coleccioneseje5.servicios.ServicioPais;
import coleccioneseje5.utilidades.Comparadores;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class COLECCIONESeje5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPais SP = new ServicioPais();
        
        Set<Pais> nombrePaises = new TreeSet(Comparadores.ordenAlfabetico);
        
        boolean bucle = true;
        
        do {
            
            nombrePaises.add(SP.crearPais());
            System.out.println("Agregar otro pais? S/N");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                if (respuesta.equalsIgnoreCase("N")) {
                    bucle = false;
                    break;
                }
                
            }else{
                System.out.println("Error");
                break;
            }
            
        } while (bucle != false);
        
        System.out.println("PILA DE PAISES ORDENADOS ALFABETICAMENTE");
        System.out.println("");
        
        for (Pais aux : nombrePaises) {
            System.out.println(aux);
            
        }
        
        Iterator<Pais> it = nombrePaises.iterator();
        
        System.out.println("");
        System.out.println("ELIMINAR UN PAIS DE LA PILA");
        System.out.println("Ingrese el nombre de un pais");
        String resp = leer.next();
        
        while (it.hasNext()) {
            String nom = it.next().getNombre();
            if (resp.equalsIgnoreCase(nom)) {
                System.out.println("Se encontro el pais");
                System.out.println("..........Eliminando..........");
                it.remove();
                break;
            }else if(it.hasNext() == false){
                System.out.println("No se encontro el pais para eliminar");
            }
        }
        
        System.out.println("");
        for (Pais aux : nombrePaises) {
            System.out.println(aux);
            
        }
        
        
    }
    
}
