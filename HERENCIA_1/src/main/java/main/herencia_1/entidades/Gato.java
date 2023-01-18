
package main.herencia_1.entidades;

public final class Gato extends Animal {
    
    private boolean collar;

    public Gato(boolean collar) {
        this.collar = collar;
    }

    public Gato(boolean collar, String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.collar = collar;
    }

    public boolean isCollar() {
        return collar;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Alimentarse() {
        System.out.println("ESte gato se alimenta de: "+ this.alimento);
    }
    
    
}
