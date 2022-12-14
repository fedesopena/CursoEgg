package asd.relacioneseje3.entidades;

import asd.relacioneseje3.enumeraciones.CartaNumeros;
import asd.relacioneseje3.enumeraciones.CartaPalo;


public class Carta {
    
    private CartaNumeros numero;
    private CartaPalo palo;

    public Carta() {
    }

    public Carta(CartaNumeros numero, CartaPalo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public CartaNumeros getNumero() {
        return numero;
    }

    public void setNumero(CartaNumeros numero) {
        this.numero = numero;
    }

    public CartaPalo getPalo() {
        return palo;
    }

    public void setPalo(CartaPalo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    
    
}
