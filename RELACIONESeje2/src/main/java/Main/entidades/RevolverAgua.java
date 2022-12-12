
package Main.entidades;


public class RevolverAgua {
    
    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverAgua() {
    }
    
    public void llenarRevolver(){
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
    }
    
    public boolean mojar(){
        
        return posicionActual.equals(posicionAgua);
    }
    
    public void siguienteChorro(){
        
        posicionActual += 1;
        
        if (posicionActual.equals(7)) {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
}
