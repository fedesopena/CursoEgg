
package entidades;


public final class EdificioDeOficinas extends Edificio {
    
    private Integer num_oficinas;
    private Integer personasXoficinas;
    private Integer num_pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer num_oficinas, Integer personasXoficinas, Integer num_pisos, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.num_oficinas = num_oficinas;
        this.personasXoficinas = personasXoficinas;
        this.num_pisos = num_pisos;
    }

    public Integer getNum_oficinas() {
        return num_oficinas;
    }

    public void setNum_oficinas(Integer num_oficinas) {
        this.num_oficinas = num_oficinas;
    }

    public Integer getPersonasXoficinas() {
        return personasXoficinas;
    }

    public void setPersonasXoficinas(Integer personasXoficinas) {
        this.personasXoficinas = personasXoficinas;
    }

    public Integer getNum_pisos() {
        return num_pisos;
    }

    public void setNum_pisos(Integer num_pisos) {
        this.num_pisos = num_pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public void cantPersonas(){
        System.out.println("La cantidad de personas totales que trabajan en TODO el edificio son: "+(personasXoficinas*num_oficinas));
    }

    @Override
    public void calcularSuperficie(double largo, double ancho) {
        System.out.println("La superficie del Edificio de Oficinas es de: "+ (largo*ancho));
    }

    @Override
    public void calcularVolumen(double largo, double ancho, double alto) {
        System.out.println("El Volumen del Edificio de Oficinas es de: "+ (largo*ancho*alto));
        cantPersonas();
        System.out.println("");
        System.out.println("----------*-----------*-----------");
    }
    
}
