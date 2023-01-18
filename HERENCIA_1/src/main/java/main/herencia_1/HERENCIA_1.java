

package main.herencia_1;

import main.herencia_1.entidades.Animal;
import main.herencia_1.entidades.Caballo;
import main.herencia_1.entidades.Gato;
import main.herencia_1.entidades.Perro;


public class HERENCIA_1 {

    public static void main(String[] args) {
        Animal perro1 = new Perro(true, "Cooper", "Carne", 10, "Coly");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro(false, "Mel", "Croquetas", 12, "SinRaza");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato(true, "Gorda", "Ratones", 9, "Persa");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo(false, "Plato", "heno", 15, "Pura Sangre");
        caballo1.Alimentarse();
    }
}
