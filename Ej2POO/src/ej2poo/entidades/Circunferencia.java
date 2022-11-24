package ej2poo.entidades;


public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //----------------------------------------//

    public double getRadio() {
        return radio;
    }
    
    //------------------------------------//

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //----------------------------------------//

    public double area(double radio){
        
        area = (radio * radio) * 3.14;
        
        return area;
    }
    
    public double perimetro(double radio){
        
        perimetro = 2 * 3.14 * radio;
        
        return perimetro;
        
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
      
    
    
    
}
