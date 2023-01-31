
package entidades;

import Interfaces.calculosFormas;


public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calclularArea() {
        double area = base * altura;
        System.out.println("El area del rectangulo es: "+ area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
    
    
    
}
