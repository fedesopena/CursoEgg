package ej5poo.servicio;

import ej5poo.entidades.CuentaBancaria;
import java.util.Scanner;


public class ServicioCuenta {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Vamos a crear una cuenta en el banco");
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
    
        return new CuentaBancaria(dni);
        
}
    

    
    
    
    
    
    
}
