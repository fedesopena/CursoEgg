package ejercicioextraextra;

import ejercicioextraextra.entidades.Pass;
import ejercicioextraextra.servicios.ServicioPass;
import java.util.Scanner;


public class EjercicioExtraExtra {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPass SP = new ServicioPass();
        
        Pass Fede = SP.crearUsuario();
        
        SP.menu(Fede);
        
    
    }
    
}
