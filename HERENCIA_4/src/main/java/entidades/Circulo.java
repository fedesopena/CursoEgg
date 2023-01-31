package entidades;

import Interfaces.calculosFormas;


public class Circulo implements calculosFormas {
    
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        diametro = radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calclularArea() {
        double area = 3.14 * radio * radio;
        System.out.println("El area del circulo es: "+ area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 3.14 * diametro;
        System.out.println("El perimetro del circulo es: "+ perimetro);
    }
    
    
    
    
    
}
