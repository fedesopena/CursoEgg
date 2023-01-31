package entidades;


public class Polideportivo extends Edificio {
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public void calcularSuperficie(double largo, double ancho) {
        this.Superficie = largo*ancho;
        System.out.println("La superficie del Polideportivo "+nombre+" es de: "+ this.Superficie);
    }

    @Override
    public void calcularVolumen(double largo, double ancho, double alto) {
        this.Volumen = largo*ancho*alto;
        System.out.println("El Volumen del Polideportivo "+nombre+" es de: "+ this.Volumen);
        if (techado) {
            System.out.println("Este polideportivo ES techado");
            System.out.println("");
            System.out.println("----------*-----------*-----------");
        }else{
            System.out.println("Este polideportivo NO ES techado");
            System.out.println("");
            System.out.println("----------*-----------*-----------");
        }
    }
    
    
}
