
package coleccioneseje5.utilidades;

import coleccioneseje5.entidades.Pais;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pais> ordenAlfabetico = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
}
