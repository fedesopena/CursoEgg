
package Main.entidades;

import java.util.List;


public class Juego {
    
    private List<Jugador> jugadores;
    private RevolverAgua revolverAgua;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, RevolverAgua revolverAgua) {
        this.jugadores = jugadores;
        this.revolverAgua = revolverAgua;
    }
    
    //--------------------------------//

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolverAgua() {
        return revolverAgua;
    }

    public void setRevolverAgua(RevolverAgua revolverAgua) {
        this.revolverAgua = revolverAgua;
    }
    
    //---------------------------------//
    
    public void llenarJuego(List<Jugador> jugadores, RevolverAgua ra){
        this.jugadores = jugadores;
        revolverAgua = ra;
    }
    
    public void ronda(){
        boolean salir = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.println("RONDA "+ (i+1));
            System.out.println("");
            for (Jugador aux : jugadores) {
                aux.disparo(revolverAgua);
                if (aux.isMojado()) {
                    System.out.println(aux.getNombre()+" TE MOJASTE");
                    salir = true;
                    break;
                }else{
                    System.out.println(aux.getNombre()+" No salio agua!");
                    revolverAgua.siguienteChorro();
                }
            }
            if (salir) {
                break;
            }
        }
    }
    
}
