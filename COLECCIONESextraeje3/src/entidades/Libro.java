
package entidades;

import java.util.Objects;


public class Libro {
    private String titulo;
    private String autor;
    private Integer numeroEjemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        ejemplaresPrestados = 0;
    }
    
    //--------//

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }
    
    //---------//

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    
    //-----//

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.autor);
        hash = 97 * hash + Objects.hashCode(this.numeroEjemplares);
        hash = 97 * hash + Objects.hashCode(this.ejemplaresPrestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.numeroEjemplares, other.numeroEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.ejemplaresPrestados, other.ejemplaresPrestados)) {
            return false;
        }
        return true;
    }
    
    //------//
    
    public boolean prestamo(){
        
        boolean p;
        
        if (numeroEjemplares.equals(ejemplaresPrestados)) {
            System.out.println("No hay mas ejemplares para prestar");
            p = false;
        }else{
            System.out.println("Se le entrego el libro a prestamo, muchas gracias");
            ejemplaresPrestados++;
            p = true;
        }
        
        return p;
        
    }
    
    public boolean devolucion(){
        
        boolean d;
        
        if (ejemplaresPrestados.equals(0)) {
            System.out.println("Error, no hay ejemplares prestados de este libro");
            d = false;
        }else{
            System.out.println("Se devolvio el libro a la Libreria");
            ejemplaresPrestados--;
            d = true;
        }
        
        return d;
    }
    
    
    //-----//

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }
    
    
    
    
    
}
