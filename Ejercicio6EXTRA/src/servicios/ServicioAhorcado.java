package servicios;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioAhorcado {
    
    public Ahorcado crearAhorcado(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una palabra");
        String palabra =  leer.next();
        palabra = palabra.toUpperCase();
        
        System.out.println("Ingrese cuantos intentos desea tener");
        int intentos = leer.nextInt();
        
        return new Ahorcado(palabra,intentos);
        
        
    }
    
    public void longitud(String[] x){
        System.out.println("La longitud de la palabra es: "+ x.length);
    }
    
    public void buscar(Ahorcado x, String letra){
        
        int aux = 0;
        int veces = 0;
        boolean ingresado = false;
        String vec[] = x.getVector();
        String vec_encontradas[] = x.getLetrasEncontradasVec();
        
        for (int i = 0; i < x.getLognitud(); i++) {
            if (vec[i].equals(letra) && vec_encontradas[i].equals(letra)) {
                ingresado = true;
                break;
            }else if(vec[i].equals(letra) && !vec_encontradas[i].equals(letra)){
                aux++;
                veces++;
                x.setLetrasEncontradas(x.getLetrasEncontradas() + 1);
                vec_encontradas[i] = letra;
                x.setLetrasEncontradasVec(vec_encontradas);
                
            }
        }
        
        if(ingresado != true){
            if(veces > 0){
                System.out.println("Se encontro la letra "+veces+" veces"); 
            }else{
                System.out.println("No se encontro la letra");
            }
        }else{
           System.out.println("YA INGRESASTE ESTA LETRA"); 
        }
        
        
        if (aux == 0) {
            x.setIntentos(x.getIntentos()-1);
        }
        
    }
    
    public void encontradas(Ahorcado x){
        System.out.println("LETRAS ENCONTRADAS: "+ x.getLetrasEncontradas());
        int faltantes = x.getLognitud() - x.getLetrasEncontradas();
        System.out.println("LETRAS FALTANTES: "+ faltantes );
    }
    
    public void intentos(Ahorcado x){
        System.out.println("INTENTOS: "+ x.getIntentos());
    }
    
    public void juego(Ahorcado x){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("");
        System.out.println("JUEGO AHORCADO");
        System.out.println("");
        System.out.println(Arrays.toString(x.getLetrasEncontradasVec()));
        System.out.println("");
        longitud(x.getVector());
        encontradas(x);
        intentos(x);
        System.out.println("");
        System.out.println("Ingrese una letra a buscar en el ahorcado");
        System.out.println("");
        String l = leer.next();
        l = l.toUpperCase();
        
        buscar(x,l);
        
        System.out.println("-----------------------");
        
    }
    
    
}
