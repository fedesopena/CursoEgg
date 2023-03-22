package Entidades;


public class Guante {
    private boolean repulsores;
    private Integer consumoEnergia;

    public Guante() {
        
        repulsores = true;
        consumoEnergia = 15;
    }

    public boolean isRepulsores() {
        return repulsores;
    }

    public void setRepulsores(boolean repulsores) {
        this.repulsores = repulsores;
    }

    public Integer getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(Integer consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    
    
}
