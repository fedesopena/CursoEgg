package main.herenciaextra2;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class HERENCIAextra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        List<Edificio> edificios = new ArrayList();
        
        edificios.add(new Polideportivo("Independiente", true, 50, 50, 15));
        edificios.add(new Polideportivo("Juventud", false, 35, 40, 10));
        edificios.add(new EdificioDeOficinas(15, 25, 15, 10, 8, 60));
        edificios.add(new EdificioDeOficinas(21, 50, 21, 20, 15, 85));
        
        Collections.shuffle(edificios);
        
        for (Edificio aux : edificios) {
            aux.calcularSuperficie(aux.getLargo(), aux.getAncho());
            aux.calcularVolumen(aux.getLargo(), aux.getAncho(), aux.getAlto());
        }
    }
}
