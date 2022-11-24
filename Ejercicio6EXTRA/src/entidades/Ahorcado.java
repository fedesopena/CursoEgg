
package entidades;


public class Ahorcado {
    
    private String vector[];
    private int intentos;
    private int longitud;
    private int letrasEncontradas;
    private String letrasEncontradasVec[];

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentos) {
        this.intentos = intentos;
        letrasEncontradas = 0;
        longitud = palabra.length();
        vector = new String[longitud];
        letrasEncontradasVec = new String[longitud];
        String letra;
        
        for(int i=0; i < longitud; i++){
            letra = palabra.substring(i, i+1);
            vector[i] = letra;
            letrasEncontradasVec[i] = "?";
        }
    }
    
    //-----------------------//

    public String[] getVector() {
        return vector;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getLognitud() {
        return longitud;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public String[] getLetrasEncontradasVec() {
        return letrasEncontradasVec;
    }
    
    

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setLognitud(int lognitud) {
        this.longitud = lognitud;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public void setLetrasEncontradasVec(String[] letrasEncontradasVec) {
        
        this.letrasEncontradasVec = letrasEncontradasVec;
    }
    
    
}
//--------------------------//