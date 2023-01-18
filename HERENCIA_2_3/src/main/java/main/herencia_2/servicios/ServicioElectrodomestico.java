
package main.herencia_2.servicios;

import java.util.Scanner;
import main.herencia_2.entidades.Electrodomestico;


public class  ServicioElectrodomestico  {
    
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el peso del electrodomestico");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next();
        color = comprobarColor(color);
        
        System.out.println("Ingrese el consumo energetico del electrodomestico (A-F)");
        String consumoEnergetico = leer.next();
        consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        
        return new Electrodomestico(color, consumoEnergetico, peso);
    }
    
    //------------------------------------------------//
    
    public String comprobarConsumoEnergetico(String letra){
        letra = letra.toUpperCase();
        if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C") && !letra.equals("D") && !letra.equals("E") && !letra.equals("F")) {
            System.out.println("La letra es incorrecta, se pondra por defecto F");
           letra = "F"; 
        }else{
            System.out.println("La letra es correcta");
        }
        
        return letra;
    }
    
    //-----------------------------------------------------//
    
    public String comprobarColor(String c){
        c = c.toLowerCase();
        if (!c.equals("blanco") && !c.equals("negro") && !c.equals("rojo") && !c.equals("azul") && !c.equals("gris")) {
            System.out.println("El color es incorrecto, se pondra por defecto como blanco");
            c = "blanco";
        }else{
            System.out.println("El color es correcto");
        }
        
        return c;
    }
    
}
