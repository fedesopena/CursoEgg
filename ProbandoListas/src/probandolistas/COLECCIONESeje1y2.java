package probandolistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import probandolistas.entidades.Perro;


public class COLECCIONESeje1y2 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        List<Perro> RazaPerros = new ArrayList<Perro>();
        
        
        boolean seguir = true;
        
        do {
            System.out.println("Ingrese una raza de perro");
            String raza = leer.next();
            RazaPerros.add(new Perro(raza));
            
            System.out.println("Desea agregar otra raza? S/N");
            String respuesta = leer.next();
            respuesta = respuesta.toUpperCase();
            if (respuesta.equals("N")) {
                seguir = false;
            }
            
            
        } while (seguir != false);
        
        for(Perro i:RazaPerros){
            System.out.println(i);
        }
        
        Iterator<Perro> it = RazaPerros.iterator();
        
        System.out.println("Ingrese una raza de perro a buscar en la coleccion");
        String resp = leer.next();
        
        while(it.hasNext()){
            
            String n = it.next().getRaza();
            
            if (n.equals(resp)) {
                System.out.println("Se encontro la Raza!");
                System.out.println("Eliminando. . . . . .");
                it.remove();
                break;
            }else if(it.hasNext()==false){
                System.out.println("No se encontro la raza del perro");
            }
            
        }
        
        for(Perro i:RazaPerros){
            System.out.println(i);
        }
        
    }
    
}
