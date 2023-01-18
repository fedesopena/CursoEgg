
package main.herencia_2.servicios;

import java.util.Scanner;
import main.herencia_2.entidades.Electrodomestico;
import main.herencia_2.entidades.Televisor;


public class ServicioTelevisor extends ServicioElectrodomestico {
    
    public Televisor crearTelevisor(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("----------*-------------*---------");
        System.out.println("Creando televisor . . . . . . ");
        System.out.println("");
        System.out.println("Cuantas pulgadas tiene el televisor?");
        Integer pulgadas = leer.nextInt();
        
        System.out.println("Tiene sintonizadaor? (S/N)");
        boolean sintonizador = false;
        String respuesta = leer.next();
        respuesta = respuesta.toUpperCase();
        if (respuesta.equals("S")) {
            sintonizador = true;
        }
        
        Electrodomestico x = crearElectrodomestico();
        
        return new Televisor(pulgadas, sintonizador, x.getColor(), x.getConsumoEnergetico(), x.getPeso());
        
    }
    
}
