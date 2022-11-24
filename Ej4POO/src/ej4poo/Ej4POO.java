package ej4poo;

import ej4poo.entidades.Rectangulo;
import ej4poo.servicio.SvRectangulo;


public class Ej4POO {

    
    public static void main(String[] args) {
        
        SvRectangulo sv = new SvRectangulo();
        
        Rectangulo R1 = sv.crearRectangulo();
        
        sv.dibujarRectangulo(R1.getBase(), R1.getAltura());
        
        System.out.println("");
        
        sv.calcularPerimetro(R1.getBase(), R1.getAltura());
        
        System.out.println("");
        
        sv.calcularSuperficie(R1.getBase(), R1.getAltura());
        
        
        
    }
    
}
