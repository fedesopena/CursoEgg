
package ejercicio3extra.servicios;

import ejercicio3extra.entidades.Raices;
import java.util.Scanner;


public class ServicioRaices {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaices(){
        
        System.out.println("Ingrese un numero entero 'a': ");
        int a = leer.nextInt();
        
        System.out.println("Ingrese un numero entero 'b': ");
        int b= leer.nextInt();
        
        System.out.println("Ingrese un numero entero 'c': ");
        int c= leer.nextInt();
        
        return new Raices(a,b,c);
        
        
    }
    
    public void getDiscriminante(Raices x){
        
        double discriminante = (Math.pow(x.getB(), 2)) - 4 * x.getA() * x.getC();
        
        x.setDiscriminante(discriminante);
        
        System.out.println("El valor del discriminantes es: "+ discriminante);
        
    }
    
    public boolean tieneRaices(Raices x){
       
        return x.getDiscriminante() >= 0;
        
    }
    
    public boolean tieneRaiz(Raices x){
        
        return x.getDiscriminante() == 0;
        
    }
    
    public void obtenerRaices(Raices x){
        
        if(tieneRaices(x) == true){
            
            System.out.println("SOLUCION 1= "+ ((-x.getB()) + (Math.sqrt(x.getDiscriminante())))/ 2*x.getA()    );
            System.out.println("SOLUCION 2= "+ ((-x.getB()) - (Math.sqrt(x.getDiscriminante())))/ 2*x.getA()    );
            
        }else{
            System.out.println("error 404");
        }
        
    }
    
    public void obtenerRaiz(Raices x){
        
        if(tieneRaiz(x) == true){
            System.out.println("SOLUCION= "+ ((-x.getB()) + (Math.sqrt(x.getDiscriminante())))/ 2*x.getA()    );
            
        }else{
            System.out.println("error 404");
        }
        
    }
    
    public void calcular(Raices x){
        
        if(tieneRaices(x) == true && tieneRaiz(x) == true){
            obtenerRaiz(x);
        }else if(tieneRaices(x) == true && tieneRaiz(x) == false){
            obtenerRaices(x);
        }else{
            System.out.println("ERROR MAXIMO");
        }
        
    }
}
