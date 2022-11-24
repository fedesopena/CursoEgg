package ej9poo;

import ej9poo.entidades.Matematicas;
import ej9poo.servicios.ServicioMatematicas;
import java.util.Scanner;


public class Ej9POO {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioMatematicas SM = new ServicioMatematicas();
        
        Matematicas Mat = new Matematicas();
        
        Mat.setNumero1((int)(Math.random() * 20+1));
        Mat.setNumero2((int)(Math.random() * 20+1));
        
        SM.devolverMayor(Mat.getNumero1(), Mat.getNumero2());
        
        SM.calcularPotencia(Mat.getNumero1(), Mat.getNumero2());
        
        SM.calculaRaiz(Mat.getNumero1(), Mat.getNumero2());
     
    }
    
}
