
package libroapp.entidades;


public class Libro {
    
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String NumPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, String NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(String NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getNumPaginas() {
        return NumPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }
   
    
    
    
    
    
    
}
