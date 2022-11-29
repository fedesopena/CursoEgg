/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla. 
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
package coleccionesextraeje2;

import coleccionesextraeje2.entidades.CantanteFamoso;
import coleccionesextraeje2.servicios.ServicioCantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;


public class COLECCIONESextraeje2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<CantanteFamoso> Cantantes = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese el nombre de un Cantante Famoso");
            String nombre = leer.next();
            System.out.println("Ingrese el nombre del disco mas vendido de ese cantante");
            String discoMasVendido = leer.next();
            Cantantes.add(new CantanteFamoso(nombre,discoMasVendido));
        }
            
        for (CantanteFamoso aux : Cantantes) {
            System.out.println(aux.getNombre()+ " y su disco mas vendido es "+ aux.getDiscoMasVendido());
        }
        
        ServicioCantanteFamoso SCF = new ServicioCantanteFamoso();
        SCF.menu(Cantantes);
    }
    
}
