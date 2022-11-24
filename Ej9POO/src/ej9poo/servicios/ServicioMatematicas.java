package ej9poo.servicios;


public class ServicioMatematicas {
    
    public void devolverMayor(int num1, int num2){
        
        if(num1 > num2){
            System.out.println(num1+" es mayor a "+ num2);
        }else if(num1 < num2){
            System.out.println(num2+" es mayor a "+ num1);
        }else{
            System.out.println("SON IGUALES PAPA");
        }
        
        
    }
    
    public void calcularPotencia(int num1, int num2){
        
        double potencia = 0;
        
        if(num1 > num2){
            potencia = Math.pow((double)num1, num2);
            System.out.println(num1+" elevado a la potencia "+num2+" es igual a: "+potencia);
        }else if(num1 < num2){
            potencia = Math.pow((double)num2, num1);
            System.out.println(num2+" elevado a la potencia "+num1+" es igual a: "+potencia);
        }else{
            System.out.println("SON IGUALES PAPA");
        }
        
    }
    
    public void calculaRaiz(int num1, int num2){
        
        double raiz = 0;
        
        if(num1 > num2){
            raiz = Math.sqrt((double)num2);
            System.out.println("La raiz cuadrada de el numero mas chico ("+num2+") es: "+raiz);
        }else if(num1 < num2){
            raiz = Math.sqrt((double)num1);
            System.out.println("La raiz cuadrada de el numero mas chico ("+num1+") es: "+raiz);
        }else{
            System.out.println("SON IGUALES PAPA");
        }
        
    }
    
}
