package pkg8poo.servicios;

import java.util.Scanner;
import pkg8poo.entidades.Cadena;


public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        return new Cadena(frase);
    }
    
    public void mostrarVocales(String frase){
        
       int cantidad = 0;
       frase = frase.toLowerCase();
       
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                cantidad++;
            }
        }
        
        System.out.println("La cantidad de vocales que tiene la frase ingresada es: "+ cantidad);
        
    }
    
    
    public void invertirFrase(String frase){
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
        
        
    }
    
    public void vecesRepetido(String frase, String letra){
        
        int contador = 0;
        frase = frase.toLowerCase();
        letra = letra.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equals(letra)){
                contador++;
            }
            
        }
        
        if(contador > 0){
            System.out.println("La letra "+letra+" se repite "+contador+" veces");
        }else{
            System.out.println("La letra no esta en la frase");
        }
        
        
    }
    
    public void compararLongitud(String frase1, String frase2){
        
        int longitud1 = frase1.length();
        int longitud2 = frase2.length();
        
        if(longitud1 > longitud2){
            System.out.println("La frase: '' "+frase1+" '' es mas larga que ''"+frase2+"''");
        }else if(longitud1 < longitud2){
            System.out.println("La frase: '' "+frase2+" '' es mas larga que ''"+frase1+"''");
        }else{
            System.out.println("Las frases tiene la misma longitud");
        }
        
        
        
    }
    
    public void unirFrase(String frase1, String frase2){
        
        System.out.println("Las frases unidas: "+frase1+frase2);
        
        
    }
    
    public void reemplazar(String frase, String letra){
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i, i+1).equals("a")){
                System.out.print(letra);
            }else{
                System.out.print(frase.substring(i, i+1));
            }
        }
        System.out.println("");
        
    }
    
    public boolean contiene(String frase, String letra){
        
        boolean contiene = false;
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i, i+1).equals(letra)){
                contiene = true;
                break;
            }
        }
        
        if(contiene == true){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        return contiene;
        
    }
    
}
