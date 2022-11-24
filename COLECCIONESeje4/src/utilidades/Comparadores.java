
package utilidades;

import entidades.PELICULA;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<PELICULA> ordenDuracionAscendente = new Comparator<PELICULA>() {
        @Override
        public int compare(PELICULA t, PELICULA t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<PELICULA> ordenDuracionDescendente = new Comparator<PELICULA>() {
        @Override
        public int compare(PELICULA t, PELICULA t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<PELICULA> ordenTitulo = new Comparator<PELICULA>() {
        @Override
        public int compare(PELICULA t, PELICULA t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<PELICULA> ordenDirector = new Comparator<PELICULA>() {
        @Override
        public int compare(PELICULA t, PELICULA t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
