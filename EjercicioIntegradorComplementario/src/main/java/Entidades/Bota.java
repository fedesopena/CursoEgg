package Entidades;


public class Bota {
    private boolean propulsored;
    private Integer consumoEnergia;

    public Bota() {
        
        consumoEnergia = 10;
        propulsored = true;
    }

    public boolean isPropulsored() {
        return propulsored;
    }

    public void setPropulsored(boolean propulsored) {
        this.propulsored = propulsored;
    }

    public Integer getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Integer consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    

    
    
    
}
