
import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;
import servicios.ServicioLibro;

/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.

La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
20
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
public class Main {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioLibro SL = new ServicioLibro();
        
        HashSet <Libro> Libreria = new HashSet();
        
        boolean agregarLibro = true;
        
        System.out.println("Vamos a agregar libros a una libreria");
        
        do {
            Libreria.add(SL.crearLibro());
            System.out.println("Desea agregar otro libro? S/N" );
            String respuesta = leer.next();
            
            if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                if (respuesta.equalsIgnoreCase("N")) {
                    agregarLibro = false;
                    break;
                }
            }else{
                System.out.println("ERROR");
            }
            
        } while (agregarLibro != false);
        
        for (Libro libro : Libreria) {
            System.out.println(libro);
            
        }
        
        do {
            System.out.println("");
            System.out.println("----MENU----");
            System.out.println("1) Llevar prestado un libro");
            System.out.println("2) Devolver un libro");
            System.out.println("3) SALIR");
            Integer respuesta = leer.nextInt();
            
            switch(respuesta){
                case 1:
                    System.out.println("Ingrese el titulo del libro que quiero llevarse prestado");
                    String tituloLibro = leer.next();
                    Integer x = 0;
                    for (Libro libro : Libreria) {
                        if (libro.getTitulo().equals(tituloLibro)) {
                            x = 1;
                        libro.prestamo();     
                        }  
                    }
                    
                    if (x.equals(0)) {
                        System.out.println("No tenemos ejemplares de ese libro en la Libreria");
                    }
                    continue;
                case 2:
                    System.out.println("Ingrese el titulo del libro a devolver");
                    String libroDevolver = leer.next();
                    Integer Z = 0;
                    for (Libro libro : Libreria) {
                        if (libro.getTitulo().equals(libroDevolver)) {
                            Z = 1;
                        libro.devolucion();
                        }  
                    }
                    
                    if (Z.equals(0)) {
                        System.out.println("No tenemos ejemplares de ese libro en la Libreria");
                    }
                    continue;
                    
                case 3:
                    break;
                default:
                    System.out.println("ERROR 324687");
            }
            
        } while (true);
        
        
        
    }
    
}
