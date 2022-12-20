
package relacioneseje1.entidades;

import relacioneseje1.enumeraciones.EdadPerro;
import relacioneseje1.enumeraciones.NombrePerro;
import relacioneseje1.enumeraciones.RazaPerro;
import relacioneseje1.enumeraciones.TamanioPerro;


public class Perro {
    
    private NombrePerro nombre;
    private RazaPerro raza;
    private EdadPerro edad;
    private TamanioPerro tamanio;

    public Perro() {
        nombre = NombrePerro.X;
        raza = RazaPerro.COLY;
        edad = EdadPerro.UNO;
        tamanio = TamanioPerro.CHICO;
    }

    public Perro(NombrePerro nombre, RazaPerro raza, EdadPerro edad, TamanioPerro tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    //----------------------//

    public NombrePerro getNombre() {
        return nombre;
    }

    public void setNombre(NombrePerro nombre) {
        this.nombre = nombre;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public EdadPerro getEdad() {
        return edad;
    }

    public void setEdad(EdadPerro edad) {
        this.edad = edad;
    }

    public TamanioPerro getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanioPerro tamanio) {
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString() {
        return nombre + " ("+ raza +", "+ edad +", "+ tamanio + ")\n";
    }
    
    
    
}
