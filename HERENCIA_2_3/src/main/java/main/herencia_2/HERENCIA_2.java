package main.herencia_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import main.herencia_2.entidades.Electrodomestico;
import main.herencia_2.entidades.Lavadora;
import main.herencia_2.entidades.Televisor;
import main.herencia_2.servicios.ServicioElectrodomestico;
import main.herencia_2.servicios.ServicioLavadora;
import main.herencia_2.servicios.ServicioTelevisor;


public class HERENCIA_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        /*
        ServicioLavadora SL = new ServicioLavadora();
        Lavadora L1 = SL.crearLavadora();
        L1.precioFinal();
        
        ServicioTelevisor ST = new ServicioTelevisor();
        Televisor T1 = ST.crearTelevisor();
        T1.precioFinal();
        
        System.out.println("--------------*-------------*---------------");
        System.out.println("El precio final de la LAVADORA es $" + L1.getPrecio());
        System.out.println("El precio final del TELEVISOR es $" + T1.getPrecio());
        */
        //-------------------------------------------//
        
        List<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(new Lavadora(35, "blanco", "C", 55));
        electrodomesticos.add(new Lavadora(25, "blanco", "B", 45));
        electrodomesticos.add(new Televisor(45, true, "negro", "A", 35));
        electrodomesticos.add(new Televisor(35, false, "negro", "B", 18));
        Collections.shuffle(electrodomesticos);
        
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;
        double sumaElectrodomesticos = 0;
        
        for (Electrodomestico aux : electrodomesticos) {
            
            if (aux.getColor().equalsIgnoreCase("blanco")) {
                System.out.println("Este electrodomestico es una lavadora");
                aux.precioFinal();
                System.out.println("Su valor es de $" + aux.getPrecio());
                sumaLavadoras += aux.getPrecio();
                
            }else{
                System.out.println("Este electrodomestico es un televisor");
                aux.precioFinal();
                System.out.println("Su valor es de $" + aux.getPrecio());
                sumaTelevisores += aux.getPrecio();
            }
            sumaElectrodomesticos += aux.getPrecio();
        }
        
        System.out.println("-----------*-------------*--------");
        System.out.println("La suma de televisores es: $" + sumaTelevisores);
        System.out.println("La suma de lavadoras es: $" + sumaLavadoras);
        System.out.println("La suma total de los electrodomesticos es de: $" + sumaElectrodomesticos);
        
    }
}
