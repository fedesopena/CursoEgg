package ej3poo;

import ej3poo.ServicioOperacion.ServicioOp;
import ej3poo.entidades.Operacion;


public class Ej3POO {

    
    public static void main(String[] args) {
        
        ServicioOp so = new ServicioOp();
        
        Operacion Op1 = so.crearOperaciopn();
        
        Op1.sumar(Op1.getNumero1(), Op1.getNumero2());
        
        Op1.restar(Op1.getNumero1(), Op1.getNumero2());
        
        Op1.multiplicar(Op1.getNumero1(), Op1.getNumero2());
        
        Op1.dividir(Op1.getNumero1(), Op1.getNumero2());
        
    }
    
}
