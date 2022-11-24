
package ejercicioextraextra.entidades;


public class Pass {
    
    private String pass;
    private String nombre;
    private long dni;

    public Pass() {
        nombre = "Usuario";
        dni = 00000000;
        pass = "asd123";
    }

    public Pass(String pass, String nombre, long dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //--------------------------//

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    //--------------------------//
    
}
