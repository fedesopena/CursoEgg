
package coleccionesextraeje2.servicios;

import coleccionesextraeje2.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioCantanteFamoso {
    
    public void agregarCantante(ArrayList<CantanteFamoso> x){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de un cantante famoso");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del disco mas vendido del artista");
        String disco = leer.next();
        x.add(new CantanteFamoso(nombre, disco));
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> x){
        
        for (CantanteFamoso aux : x) {
            System.out.println(aux.getNombre()+ " y su disco mas vendido es "+ aux.getDiscoMasVendido());
        }
        
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> x){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de un cantante a eliminar en la lista");
        String nombre = leer.next();
        boolean encontro = false;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getNombre().equalsIgnoreCase(nombre)) {
                x.remove(i);
                System.out.println("Se elimino el cantante correctametne");
                encontro = true;
            }
        }
        if (encontro == false) {
            System.out.println("NO se encontro ningun cantante con ese nombre");
        }
    
       
    }
    
    public void menu(ArrayList<CantanteFamoso> x){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        int respuesta;
        
        do {
            System.out.println("----MENU----");
            System.out.println("1) Agregar cantante famoso a la lista");
            System.out.println("2) Mostrar todos los cantantes de la lista");
            System.out.println("3) Eliminar un cantante de la lista");
            System.out.println("4) SALIR");
            respuesta = leer.nextInt();
            switch(respuesta){
                case 1:
                    agregarCantante(x);
                    continue;
                case 2:
                    mostrarCantantes(x);
                    continue;
                case 3:
                    eliminarCantante(x);
                    continue;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("ERROR 32131564");
                
            }
        } while (menu != false);
        
    }
    
}
