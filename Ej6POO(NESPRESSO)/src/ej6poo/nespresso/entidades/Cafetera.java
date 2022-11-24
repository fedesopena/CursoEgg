
package ej6poo.nespresso.entidades;


public class Cafetera {
    
    private int capacidadMaxima;
    private int capacidadActual;

    
    //-------------------------------------------------------//
    public Cafetera() {
        capacidadMaxima = 10;
        capacidadActual=0;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    //----------------------------------------------//

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }
    
    //-------------------------------------------//

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    //------------------------------------------------//
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
        System.out.println("Se ha llenado la cafetera correctamente");
    }
    
    public void servirTaza(int taza){
        
        if(taza > capacidadActual){
            System.out.println("Se sirvio lo que quedaba de la cafetera, pero no se lleno la taza");
            taza -= capacidadActual;
            System.out.println("Se sirvio hasta "+ capacidadActual);
            capacidadActual = 0;
            System.out.println("No queda mas cafe en la cafetera");
        }else{
            capacidadActual -= taza;
            System.out.println("Se lleno la taza");
        }
        
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
        System.out.println("Se vacio la cafetera");
    }
    
    public void agregarCafe(int cafe){
        
        if(capacidadActual+cafe > capacidadMaxima){
            System.out.println("Se agrego el cafe a la cafetera y se lleno");
            capacidadActual = capacidadMaxima;
            
        }else{
            capacidadActual += cafe;
            System.out.println("Se agrego cafe correctamente");
        }
    }
}
