package coleccioneseje3;

import coleccioneseje3.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*

Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 
Despues de ese bluce tendremos el siguiente método en la clase Alumno: 
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.


 */
public class COLECCIONESeje3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        boolean crearAlumno = true;

        List<Alumno> notasAlumno = new ArrayList<Alumno>();

        System.out.println("Vamos a agregar alumnos a la lista");

        do {

            List<Integer> notas = new ArrayList<Integer>();

            System.out.println("Ingrese el nombre del alumno");
            String nombreAlumno = leer.next();
            nombreAlumno = nombreAlumno.toUpperCase();

            int tres_notas = 0;
            System.out.println("Ingrese las tres notas ");
            do {
                System.out.print("NOTA " + (tres_notas + 1) + ":");
                Integer n = leer.nextInt();
                notas.add(n);
                tres_notas++;

            } while (tres_notas < 3);

            notasAlumno.add(new Alumno(nombreAlumno, notas));

            System.out.println("Queres agregar otro alumno? S/N");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("N")) {
                crearAlumno = false;
            }

        } while (crearAlumno != false);

        boolean NT = true;

        System.out.println("Vamos a calcuar la nota final de algun alumno");
        do {
            int encontrar = 0;
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            nombre = nombre.toUpperCase();

            for (Alumno i : notasAlumno) {
                if (i.getNombre().equals(nombre)) {
                    i.notaFinal();
                    encontrar++;
                }
            }
            
            if (encontrar==0) {
                System.out.println("No se encontro el alumno");
            }

            System.out.println("Preguntar la nota final de otro alumno? S/N");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {
                NT = false;
            }

        } while (NT != false);

    }

}
