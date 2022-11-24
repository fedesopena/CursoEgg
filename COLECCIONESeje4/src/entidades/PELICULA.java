
package entidades;


public class PELICULA {
    
    private String titulo;
    private String director;
    private Integer duracion;
    private Integer horas;
    private Integer minutos;

    public PELICULA() {
    }

    public PELICULA(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        minutos = duracion;
        horas = 0;
        
        if (minutos > 60) {
            do {
                minutos -= 60;
                horas++;

            } while (minutos > 60);
            
        }
        
    }
    
    
    //-------------//

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }
    
    public Integer getHoras(){
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    //---------------//

    @Override
    public String toString() {
        return "PELICULA{titulo= " +titulo+", director= "+director+", duracion= "+horas+" hora(s), "+minutos+" minutos}";
    }
    
    
}
