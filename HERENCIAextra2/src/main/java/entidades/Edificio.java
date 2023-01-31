package entidades;


public abstract class Edificio {
    
    protected double ancho;
    protected double largo;
    protected double alto;
    protected double Superficie;
    protected double Volumen;

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double Superficie) {
        this.Superficie = Superficie;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
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
    
    
        
    
    public abstract void calcularSuperficie(double largo, double ancho);
    public abstract void calcularVolumen(double largo, double ancho, double alto);
    
}
