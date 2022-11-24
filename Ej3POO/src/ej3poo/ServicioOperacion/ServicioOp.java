package ej3poo.ServicioOperacion;

import ej3poo.entidades.Operacion;
import java.util.Scanner;


public class ServicioOp {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperaciopn(){
        
        System.out.println("Ingrese dos numeros numeros enteros");
        System.out.print("Numero 1: ");
        int n1 = leer.nextInt();
        System.out.print("Numero 2: ");
        int n2 = leer.nextInt();
        
        return new Operacion(n1,n2);
    }
    
   
    
    
}
