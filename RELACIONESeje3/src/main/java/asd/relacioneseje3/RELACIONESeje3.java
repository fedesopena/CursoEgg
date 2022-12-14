package asd.relacioneseje3;

import asd.relacioneseje3.entidades.Baraja;
import asd.relacioneseje3.entidades.Carta;
import asd.relacioneseje3.enumeraciones.CartaNumeros;
import asd.relacioneseje3.enumeraciones.CartaPalo;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class RELACIONESeje3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        LinkedList<Carta> baraja = new LinkedList();
        
        for (CartaPalo palo : CartaPalo.values()) {
            for (CartaNumeros num : CartaNumeros.values()) {
                baraja.add(new Carta(num, palo));
            }
        }
       
        Baraja hachazo = new Baraja(baraja);
        hachazo.barajar();
        System.out.println("Cuantas cartas quiere que muestre?");
        Integer x = leer.nextInt();
        hachazo.darCartas(x);
        
        hachazo.cartasDisponibles();
        
        System.out.println("------CARTAS EN EL MONTON------");
        hachazo.cartasMonton();
        System.out.println("----------------------------------");
        
        System.out.println("--MUESTRA DE BARAJA --");
        hachazo.mostrarBaraja();
        System.out.println("-------------------");
        
         
  
        
    }
    
}
