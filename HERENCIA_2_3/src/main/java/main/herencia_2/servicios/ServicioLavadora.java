
package main.herencia_2.servicios;

import java.util.Scanner;
import main.herencia_2.entidades.Electrodomestico;
import main.herencia_2.entidades.Lavadora;


public class ServicioLavadora extends ServicioElectrodomestico {
    
    public Lavadora crearLavadora(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----------*----------*----------");
        System.out.println("Creando lavadora . . . . . . . .");
        System.out.println("");
        System.out.println("Cuanta carga puede soportar la lavadora?");
        Integer carga = leer.nextInt();
        
        Electrodomestico x = crearElectrodomestico();
        
        return new Lavadora(carga, x.getColor(), x.getConsumoEnergetico(), x.getPeso());
    }
}
