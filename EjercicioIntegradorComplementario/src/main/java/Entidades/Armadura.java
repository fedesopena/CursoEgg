package Entidades;


public class Armadura {
    
    private String colorPrimario;
    private String colorSecundario;
    private Integer nivelResistencia;
    private Integer nivelSalud;
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Integer generador;
    private Casco casco;

    public Armadura() {
    }

    public Armadura(Bota botaIzquierda, Bota botaDerecha, Guante guanteIzquierdo, Guante guanteDerecho, Casco casco) {
        this.botaIzquierda = botaIzquierda;
        this.botaDerecha = botaDerecha;
        this.guanteIzquierdo = guanteIzquierdo;
        this.guanteDerecho = guanteDerecho;
        this.casco = casco;
        
        colorPrimario = "Rojo";
        colorSecundario = "Amarillo";
        nivelSalud = 100;
        nivelResistencia = 100;
        generador = 100;
    }
    
    
            
}
