package main.herencia_4;

import entidades.Circulo;
import entidades.Rectangulo;


public class HERENCIA_4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(7);
        c1.calclularArea();
        c1.calcularPerimetro();
        
        System.out.println("-----------------*-------------");
        
        Rectangulo r1 = new Rectangulo(15, 10);
        r1.calclularArea();
        r1.calcularPerimetro();
    }
}
