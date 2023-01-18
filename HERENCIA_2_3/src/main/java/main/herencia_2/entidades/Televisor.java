
package main.herencia_2.entidades;


public final class Televisor extends Electrodomestico {
    
    private Integer pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizador, String color, String consumoElectrico, double peso) {
        super(color, consumoElectrico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if (pulgadas >= 40) {
            precio += precio*0.30;
        }
        
        if (sintonizador) {
            precio += 500d;
        }
    };
    
    
}
