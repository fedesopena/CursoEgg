
package ej5poo.entidades;


public class CuentaBancaria {
    
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long DNI) {
        this.DNI = DNI;
        saldoActual=0;
        numeroCuenta = (int)(Math.random()*99999+10000);
                
    }

    
    
    //--------------------------------------------------------//

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    
    //-------------------------------------------------------//

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //------------------------------------------------------//
    
    public void ingresar(int dinero){
        
        saldoActual += dinero;
        System.out.println("Se ha ingresado el dinero correctamente");
        
    }
    
    
    public void retirar(int dinero){
        
        if (saldoActual < dinero){
            saldoActual = 0;
        }else{
            saldoActual-=dinero;
        }
        
        System.out.println("Se a retirado el dinero correctamente");
        
    }
    
    public void extraccionRapida(int dinero){
        if(dinero > (saldoActual*0.2)){
            System.out.println("No puede sacar mas del 20%");
        }else{
            saldoActual -= dinero;
            System.out.println("Se a retirado el dinero correctamente");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: $"+ saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("DATOS DE LA CUENTA");
        System.out.print("DNI: "+ DNI);
        System.out.println("");
        
        System.out.print("NUMERO DE CUENTA: "+ numeroCuenta);
        System.out.println("");
        
        System.out.print("SALDO ACTUAL: $"+ saldoActual);
    }

   
    
}
