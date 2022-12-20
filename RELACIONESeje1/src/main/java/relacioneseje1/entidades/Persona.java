package relacioneseje1.entidades;

import relacioneseje1.enumeraciones.ApellidoPersona;
import relacioneseje1.enumeraciones.NombrePersona;


public class Persona {
    
    private NombrePersona nombre;
    private ApellidoPersona apellido;
    private Integer dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(NombrePersona nombre, ApellidoPersona apellido, Integer dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }
    
    //----------------------//

    public NombrePersona getNombre() {
        return nombre;
    }

    public void setNombre(NombrePersona nombre) {
        this.nombre = nombre;
    }

    public ApellidoPersona getApellido() {
        return apellido;
    }

    public void setApellido(ApellidoPersona apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return nombre +" " +apellido+ " "+ dni + " "+ perro;
    }
    
    
    
}
