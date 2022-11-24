package pkg8poo.entidades;


public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }
    
    //------------------------------------//

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //------------------------------------------//
    
    
    
}
