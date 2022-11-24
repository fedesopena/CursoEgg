
package ej3poo.entidades;


public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void sumar(int n1, int n2){
        
        System.out.print("La suma de los dos numeros es: "+ (n1+n2));
        System.out.println("");
        
    }
    
    public void restar(int n1, int n2){
        
        System.out.print("La resta de los numeros es:" + (n1-n2));
        System.out.println("");
        
    }
    
    public void multiplicar(int n1, int n2){
        
        if (n1 == 0 || n2 == 0){
            System.out.println("0");
            System.out.println("ERROR, NO INGRESE EL NUMERO 0");
        }else{
            System.out.print("La multiplicacion es: "+ (n1*n2));
            System.out.println("");
        }
        
    }
    
    public void dividir(int n1, int n2){
        
        if (n1 == 0 || n2 == 0){
            System.out.println("0");
            System.out.println("ERROR, NO INGRESE EL NUMERO 0");
        }else{
            double division = (double)n1 / n2;
            System.out.print("La division es: "+ division);
            System.out.println("");
        }
        
        
    }
    
    
    
}
