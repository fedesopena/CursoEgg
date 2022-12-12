

package relacioneseje1;

import java.util.Scanner;
import relacioneseje1.entidades.Perro;
import relacioneseje1.entidades.Persona;


public class RELACIONESeje1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Perro perro1 = new Perro("Cooper", "Coly", 11, 5);
        Perro perro2 = new Perro("Mel", "Callejero", 15, 2);
        
        Persona persona1 = new Persona("Federico", "Sopena", 39811600, perro1);
        Persona persona2 = new Persona("Camila", "Sopena", 40140014, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
