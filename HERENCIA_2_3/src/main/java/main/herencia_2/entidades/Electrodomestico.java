
package main.herencia_2.entidades;


public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumoElectrico, double peso) {
        precio = 1000d;
        this.color = color;
        this.consumoEnergetico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEenergetico(String consumoEenergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        
    }
    
    public void precioFinal(){
        
        switch(consumoEnergetico){
            case "A":
                precio += 1000d;
                break;
            case "B":
                precio += 800d;
                break;
            case "C":
                precio += 600d;
                break;
            case "D":
                precio += 500d;
                break;
            case "E":
                precio += 300d;
                break;
            case "F":
                precio += 100d;
                break;
        }
        
        if (peso > 49) {
            if (peso > 79) {
                precio += 1000d;
            }else{
                precio += 800d;
            }
        }else{
            if (precio > 19) {
                precio += 500d;
            }else{
                precio += 100d;
            }
        }
        
    };
    
    
}
