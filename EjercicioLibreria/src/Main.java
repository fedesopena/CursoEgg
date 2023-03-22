
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencia.AutorController;
import persistencia.EditorialController;
import persistencia.LibroController;
import servicios.ServicioAutor;
import servicios.ServicioEditorial;
import servicios.ServicioLibro;


public class Main {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        //-----------------------------------------------//
        
        LibroController LC = new LibroController();
        AutorController AC = new AutorController();
        EditorialController EC = new EditorialController();
        
        ServicioAutor SA = new ServicioAutor();
        ServicioEditorial SE = new ServicioEditorial();
        ServicioLibro SL = new ServicioLibro();
        
        //-----------------------------------------------//
        
        String respuesta;
        
        do {
            System.out.println("Bienvenido a la Libreria");
            System.out.println("------------------------");
            System.out.println("");
            System.out.println("Que desea hacer?");
            System.out.println("1) Buscar Libro por ISBN");
            System.out.println("2) Buscar Libro por Titulo");
            System.out.println("3) Buscar Libro/s por nombre del Autor");
            System.out.println("4) Buscar Libro/s por nombre de la Editorial");
            System.out.println("5) Ingresar un Libro");
            System.out.println("6) Ingresar un Autor");
            System.out.println("7) Ingresar una Editorial");
            System.out.println("8) SALIR");
            
            respuesta = leer.next();
            
            switch(respuesta){
                case "1":
                    System.out.println("Ingrese el ISBN(id) del libro");
                    Long x = leer.nextLong();
                    Libro y = SL.buscarLibroXid(x);
                    if (y==null) {
                        System.out.println("No se encontro el libro");
                    }else{
                        System.out.println(y);
                        
                    }
                    continue;
                case "2":
                    System.out.println("Ingrese el Titulo del Libro");
                    String libro = leer.next();
                    Libro l2 = SL.buscarLibroXnombre(libro);
                    if (l2==null) {
                        System.out.println("No se encontro el libro");
                    }else{
                        System.out.println(l2);
                    }
                    continue;
                case "3":
                    System.out.println("Ingrese el nombre del Autor");
                    String na = leer.next();
                    List<Libro> librosAutor = SL.buscarLibrosXnombreAutor(na);
                    if (librosAutor.isEmpty()) {
                        System.out.println("No se encontraron libros del Autor");
                    }else{
                        for (Libro aux : librosAutor) {
                            System.out.println(aux);
                        }
                    }
                    continue;
                case "4":
                    System.out.println("Ingrese el nombre de la Editorial");
                    String ed = leer.next();
                    List<Libro> librosEditorial = SL.buscarLibrosXnombreEditorial(ed);
                    if (librosEditorial.isEmpty()) {
                        System.out.println("No se encontraron libros de esa Editorial");
                    }else{
                        for (Libro aux : librosEditorial) {
                            System.out.println(aux);
                        }
                    }
                    continue;
                case "5":
                    SL.crearLibro();
                    continue;
                case "6":
                    SA.crearAutor();
                    continue;
                case "7":
                    SE.crearEditorial();
                    continue;
                case "8":    
                    break;
                default:
                    System.out.println("ERROR 3546832165");
            }
            
        } while (!respuesta.equals("8"));
        
        
        
        
       
        

    }
    
}
