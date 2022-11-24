package ej4poo.servicio;

import ej4poo.entidades.Rectangulo;
import java.util.Scanner;


public class SvRectangulo {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        
        System.out.println("Ingrese la base del rectangulo");
        int base = leer.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();
        
        return new Rectangulo(base,altura);
    }
    
    public void calcularSuperficie(int base, int altura){
        
        System.out.println("La superficie del rectangulo es: " + (base*altura));
        
    }
    
    public void calcularPerimetro(int base, int altura){
        
        System.out.println("El perimetro del rectangulo es: "+ (base + altura)*2);
        
        
    }
    
    public void dibujarRectangulo(int base, int altura){
        
        for (int i = 0; i <= altura-1; i++) {
            for (int j = 0; j <= base-1; j++) {
                if (i==0 || j==0 || i==altura-1 || j==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
    }
}
