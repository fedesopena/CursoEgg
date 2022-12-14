package asd.relacioneseje3.entidades;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Baraja {
    LinkedList<Carta> cartas;
    LinkedList<Carta> monton;

    public Baraja(LinkedList<Carta> cartas) {
        this.cartas = cartas;
        monton = new LinkedList();
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    public LinkedList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(LinkedList<Carta> monton) {
        this.monton = monton;
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
        System.out.println("Se barajo el mazo");
        System.out.println("------");
    }
    
    public void siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println("NO HAY MAS CARTAS EN LA BARAJA");
        }else{
            System.out.println(cartas.getFirst());
            monton.addFirst(cartas.getFirst());
            System.out.println("Se agrego esta carta al monton");
            System.out.println("------");
            cartas.remove(cartas.getFirst());
            
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan en el mazo: "+cartas.size()+ " cartas");
        System.out.println("-----");
    }
    
    public void darCartas(Integer n){
        if (cartas.size() < n) {
            System.out.println("Hay menos cartas en el mazo que las que esta pidiendo");
            System.out.println("-----");
        }else{
            for (int i = 0; i < n; i++) {
                siguienteCarta();
            }
        }
    }
    
    public void cartasMonton(){
        if (monton.isEmpty()) {
            System.out.println("NO HAY CARTAS EN EL MONTON");
            System.out.println("-----");
        }else{
            System.out.println("Estas son la cartas que quedan en el monton");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", monton=" + monton + '}';
    }
    
    
    
}
