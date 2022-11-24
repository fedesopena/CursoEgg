
import entidades.Ahorcado;
import java.util.Arrays;
import servicios.ServicioAhorcado;

public class Juego {

    
    public static void main(String[] args) {
        
        ServicioAhorcado SA = new ServicioAhorcado();
        
        Ahorcado A1 = SA.crearAhorcado();
        
        do{
        SA.juego(A1);
        if(A1.getLetrasEncontradas() == A1.getLognitud()){
            System.out.println("Ganaste! Encontraste la palabra");
            System.out.println(Arrays.toString(A1.getLetrasEncontradasVec()));
            break;
        }
            
        }while(A1.getIntentos() > 0);
        

    }
    
}
