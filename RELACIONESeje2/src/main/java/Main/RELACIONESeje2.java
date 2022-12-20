package Main;

import Main.entidades.Juego;
import Main.entidades.Jugador;
import Main.entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RELACIONESeje2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        List<Jugador> jugadores = new ArrayList();
        
        RevolverAgua RA = new RevolverAgua();
        RA.llenarRevolver();
        
        System.out.println("Cuantos jugadores creamos para la ruleta rusa? (Maximo 4 jugaroes)");
        Integer resp = leer.nextInt();
        
        if (resp < 1 || resp > 6) {
            System.out.println("Error, por defeto se pondran 4 jugadores");
            resp = 4;
        }
        
        
        for (int i = 0; i < resp; i++) {
            System.out.println("Nombre de jugador N."+(i+1));
            String nombre = leer.next();
            System.out.println("Ingrese un id (numero) para identificarlo");
            Integer id = leer.nextInt();
            jugadores.add(new Jugador(id, nombre));
        }
        
        
        Juego jugar = new Juego();
        jugar.llenarJuego(jugadores, RA);
        
        jugar.ronda();
        
    }
}
