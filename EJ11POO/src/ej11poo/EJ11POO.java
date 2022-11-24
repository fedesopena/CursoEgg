//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

package ej11poo;

import java.util.Date;


public class EJ11POO {

    
    public static void main(String[] args) {
        
        int dia = 2;
        int mes = 1;
        int anio = 97;
        
        Date nacimiento = new Date(anio,mes,dia);
        
        Date fechaActual = new Date();
        
        System.out.println(nacimiento);
        
        System.out.println(fechaActual);
        
        System.out.println("La diferencia de años entre las dos fechas es de: "+ (fechaActual.getYear() - nacimiento.getYear() ));
        
    }
    
}
