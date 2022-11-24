
package ej12poo.entidades;

import java.util.Date;


public class Persona {
    
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    
    //------------------------------//

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    //------------------------------------//

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
}
