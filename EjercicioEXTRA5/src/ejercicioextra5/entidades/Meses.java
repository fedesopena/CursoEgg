
package ejercicioextra5.entidades;


public class Meses {
    
   String meses[] = new String[12];
   String mesSecreto;

    public Meses() {
        
        meses[0]= "enero";
        meses[1]= "febrero";
        meses[2]= "marzo";
        meses[3]= "abril";
        meses[4]= "marzo";
        meses[5]= "junio";
        meses[6]= "julio";
        meses[7]= "agosto";
        meses[8]= "septiembre";
        meses[9]= "octubre";
        meses[10]= "noviembre";
        meses[11]= "diciembre";
        
        mesSecreto = meses[(int) (Math.random() * 11 + 1)];
        
        
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
   
   
    
}
