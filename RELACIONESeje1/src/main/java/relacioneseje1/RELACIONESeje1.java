package relacioneseje1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import relacioneseje1.entidades.Perro;
import relacioneseje1.entidades.Persona;
import relacioneseje1.enumeraciones.ApellidoPersona;
import relacioneseje1.enumeraciones.EdadPerro;
import relacioneseje1.enumeraciones.NombrePerro;
import relacioneseje1.enumeraciones.NombrePersona;
import relacioneseje1.enumeraciones.RazaPerro;
import relacioneseje1.enumeraciones.TamanioPerro;

public class RELACIONESeje1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        LinkedList<Perro> perros = new LinkedList();
        LinkedList<Persona> personas = new LinkedList();

        //-----------//
        RazaPerro razasPerros[] = new RazaPerro[5];
        razasPerros = RazaPerro.values();

        EdadPerro edadesPerros[] = new EdadPerro[20];
        edadesPerros = EdadPerro.values();

        TamanioPerro tamaniosPerros[] = new TamanioPerro[4];
        tamaniosPerros = TamanioPerro.values();
        //----------//

        for (NombrePerro aux : NombrePerro.values()) {
            Integer rp = (int) (Math.random() * 5 + 1);
            Integer ep = (int) (Math.random() * 20 + 1);
            Integer tp = (int) (Math.random() * 4 + 1);

            perros.add(new Perro(aux, razasPerros[rp - 1], edadesPerros[ep - 1], tamaniosPerros[tp - 1]));
        }

        //-----------------//
        ApellidoPersona apellidos[] = new ApellidoPersona[8];
        apellidos = ApellidoPersona.values();

        //------------//
        for (NombrePersona aux : NombrePersona.values()) {
            Integer ap = (int) (Math.random() * 8 + 1);
            Integer dni = (int) (Math.random() * 50000000 + 10000000);

            personas.add(new Persona(aux, apellidos[ap - 1], dni, new Perro()));

        }
        
        for (Persona aux : personas) {
            System.out.println(aux);
        }
        
        
        boolean adoptado;
        String adoptar;
        for (Persona aux : personas) {
            System.out.println("");
            System.out.println(aux.getNombre() + " "+ aux.getApellido());
            System.out.println("");
            System.out.println("Ingrese el nombre del perro que desea adoptar");
            for (Perro perro : perros) {
                System.out.println(perro.getNombre());
            }
            do {
                adoptado = false;
                adoptar = leer.next();
                adoptar = adoptar.toUpperCase();
                for (Persona persona : personas) {
                    if (persona.getPerro().getNombre().toString().equals(adoptar)) {
                        adoptado = true;
                        break;
                    }
                }
                if (adoptado) {
                    System.out.println("Ese perro ya fue adoptado, elije otro ");
                }
            } while (adoptado != false);
            
            for (Perro perro : perros) {
                if (perro.getNombre().toString().equals(adoptar)) {
                    aux.setPerro(perro);
                    System.out.println("ADOPTASTE A "+ perro.getNombre());
                    break;
                }
            }
            
        }
        
        for (Persona pers : personas) {
            System.out.println(pers);
        }

    }

}
