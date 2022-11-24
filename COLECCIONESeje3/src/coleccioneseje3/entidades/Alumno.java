
package coleccioneseje3.entidades;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
    
    private String nombre;
    private List<Integer> notas = new ArrayList<Integer>();

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    //------------------//

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    
    //---------------//
    
    public void notaFinal(){
        
        Integer notaFinal = 0;
        
        for(Integer i:notas){
            notaFinal += i;
        }
        
        System.out.println("La nota final de "+nombre+" es: "+ notaFinal/3);
    }
    
}
