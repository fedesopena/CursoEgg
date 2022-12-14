package ej10poo;


import java.util.Arrays;


//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.


public class EJ10POO {

    
    public static void main(String[] args) {
        
        float A[] = new float[50];
        float B[] = new float[20];
        
        System.out.println("ARREGLO A");
        for (int i = 0; i < 50; i++) {
            A[i] = (float) (Math.random() * 50);
            System.out.print("["+A[i]+"]");
        }
        
        System.out.println("");
        
        Arrays.sort(A);
        System.out.println("ARREGLO A ordenado");
        for (int i = 0; i < 50; i++) {
            System.out.print("["+A[i]+"]");
        }
        
        System.arraycopy(A, 0, B, 0, 10);
        
        Arrays.fill(B, 10, 20,(float) 0.5 );
        
        System.out.println("");
        
        System.out.println("ARREGLO B");
        for (int j = 0; j < 20; j++) {
           System.out.print("["+B[j]+"]"); 
        }
    }
    
}
