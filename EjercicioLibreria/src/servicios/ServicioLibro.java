/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import persistencia.AutorController;
import persistencia.EditorialController;
import persistencia.LibroController;

/**
 *
 * @author enano
 */
public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    LibroController LC = new LibroController();
    AutorController AC = new AutorController();
    EditorialController EC = new EditorialController();
    
    ServicioAutor SA = new ServicioAutor();
    ServicioEditorial SE = new ServicioEditorial();
    
    public void crearLibro(){
        Libro x = new Libro();
        System.out.println("---Crear Libro en la Libreria---");
        
        x.setId(UUID.randomUUID().getMostSignificantBits());
        
        System.out.println("Indicar Titulo del Libro");
        x.setTitulo(leer.next());
        
        System.out.println("Indicar el año en que fue publicado el Libro");
        x.setAnio(leer.nextInt());
        
        System.out.println("Indique la cantidad de ejemplares que ingresaran a la libreria");
        x.setEjemplares(leer.nextInt());
        
        x.setEjemplaresRestantes(x.getEjemplares());
        x.setEjemplaresPrestados(0);
        x.setAlta(true);
        
        boolean validar = false;
        do {
            System.out.println("Ingrese el nombre del Autor");
            String nombreAutor = leer.next();
            
            List <Autor> autor = (List <Autor>) AC.findName(nombreAutor);
            
            if (autor.isEmpty()) {
                System.out.println("El Autor no existe, vamos a crearlo");
                SA.crearAutor();
                validar = true;
            }else{
                x.setAutor(AC.findName(nombreAutor).get(0));
                validar = true;
            }
            
        } while (validar != true);
        
        validar = false;
        do {
            System.out.println("Ingrese el nombre de la Editorial");
            String nombreEditorial = leer.next();
            
            List<Editorial> editorial = (List <Editorial>) EC.findName(nombreEditorial);
            
            if (editorial.isEmpty()) {
                System.out.println("La Editorial no existe, vamos a crearla");
                SE.crearEditorial();
                validar = true;
            }else{
                x.setEditorial(EC.findName(nombreEditorial).get(0));
                validar = true;
            }
        } while (validar != true);
        
        LC.crear(x);
    }
    
    public void borrarLibro(Libro x){
        LC.borrar(x.getId());
    }
    
    public Libro buscarLibroXid(Long id){
        
        List<Libro> x = LC.findId(id);
         
        if (x.isEmpty()) {
            Libro y = null;
            return y;
        }else{
            return x.get(0);
            
        }
            
    }
    
    public Libro buscarLibroXnombre(String nombre){
        List<Libro> x = LC.findByName(nombre);
        if (x.isEmpty()) {
            Libro y = null;
            return y;
        }else{
            return x.get(0);   
        }
    }
    
    public List<Libro> buscarLibrosXnombreAutor(String nombreAutor){
        
        List<Libro> librosDelAutor = LC.findByAutorName(nombreAutor);
        
        return librosDelAutor;
    }
    
    public List<Libro> buscarLibrosXnombreEditorial(String nombreEditorial){
        
        List<Libro> librosDelAutor = LC.findByEditorialName(nombreEditorial);
        
        return librosDelAutor;
    }
}
