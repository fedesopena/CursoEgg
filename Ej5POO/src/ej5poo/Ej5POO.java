package ej5poo;

import ej5poo.entidades.CuentaBancaria;
import ej5poo.servicio.ServicioCuenta;


public class Ej5POO {

    
    public static void main(String[] args) {
        
        ServicioCuenta SC = new ServicioCuenta();
        
        CuentaBancaria Cuenta01 = SC.crearCuenta();
              
        Cuenta01.consultarDatos();
        System.out.println("");
        
        Cuenta01.ingresar(5000);
        System.out.println("");
        
        Cuenta01.consultarSaldo();
        System.out.println("");
        
        Cuenta01.retirar(250);
        System.out.println("");
        
        Cuenta01.consultarSaldo();
        System.out.println("");
        
        Cuenta01.extraccionRapida(4500);
        System.out.println("");
        
        Cuenta01.extraccionRapida(300);
        System.out.println("");
        
        
        
        
    }
    
  
    
}
