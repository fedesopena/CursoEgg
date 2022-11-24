package ej2poo;

import ej2poo.entidades.Circunferencia;
import ej2poo.service.Servicio;


public class Ej2POO {

    
    public static void main(String[] args) {
        
        Servicio s1 = new Servicio();
        
        Circunferencia c1 = s1.crearCircunferencia();
        
       c1.area(c1.getRadio());
       
       c1.perimetro(c1.getRadio());
       
        System.out.println(c1);
        
        
        
    }
    
}
