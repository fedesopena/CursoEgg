
package main.herencia_2.entidades;


public final class Lavadora extends Electrodomestico {
    private Integer carga;


    public Lavadora(Integer carga,  String color, String consumoElectrico, double peso) {
        super(color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
       
        super.precioFinal();
        
        if (carga >= 30) {
            precio += 500d;
        }
    }
  
    
    
}
