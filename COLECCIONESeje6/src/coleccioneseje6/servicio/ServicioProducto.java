
package coleccioneseje6.servicio;

import coleccioneseje6.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ServicioProducto {
    
    public Producto crearProducto(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        
        System.out.println("Ingrese el valor del procuto (valor entero)");
        Integer precio = leer.nextInt();
        
        return new Producto(nombre, precio);
        
    }
    
    public void introducirProducto(HashMap<String, Integer> X){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        
        System.out.println("Ingrese el valor del procuto (valor entero)");
        Integer precio = leer.nextInt();
        
        X.put(nombre, precio);
        
        System.out.println("Se agrego el producto correctamente");
        System.out.println("");
        
    }
    
    public void modificarPrecio(String llave,Integer precio, Integer precioNuevo ,HashMap<String, Integer> X){
        
        X.replace(llave, precio, precioNuevo);
        System.out.println("Se modifico el valor del producto correctamente");
        System.out.println("");
        
    }
    
    public void eliminarProducto(String llave, HashMap<String, Integer> X){
        
        boolean eliminar = X.containsKey(llave);
        
        if (eliminar == true) {
            X.remove(llave);
            System.out.println("Se elimino el procuto correctamente");
            System.out.println("");
        }else{
            System.out.println("No se encontro el producto");
            System.out.println("");
        }
        
        
        
    }
    
    public void mostrarProductos(HashMap<String, Integer> X){
        
        for (Map.Entry<String, Integer> entry : X.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key +" $"+ value);
            
        }
        
    }
    
    public void menu(HashMap<String, Integer> X){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean menu = true;
        
        do {
            System.out.println("--------MENU---------");
            System.out.println("1) Ingresar un producto");
            System.out.println("2) Modificar Precio de un producto");
            System.out.println("3) Eliminar un producto");
            System.out.println("4) Mostrar todos los productos ingresados");
            System.out.println("5) Salir");
            
            int respuesta = leer.nextInt();
            
            switch(respuesta){
                case 1:
                    introducirProducto(X);
                    continue;
                case 2:
                    System.out.println("Ingrese el nombre del producto a modificar");
                    String nombre = leer.next();
                    boolean P = X.containsKey(nombre);
                    if (P == true) {
                        System.out.println("Ingrese el NUEVO precio para el producto(valor entero)");
                        Integer nuevoPrecio = leer.nextInt();
                        modificarPrecio(nombre, X.get(nombre), nuevoPrecio, X);
                        
                    }else{
                        System.out.println("No se encontro el producto");
                    };
                    continue;
                case 3:
                    System.out.println("Ingrese el nombre del producto a eliminar");
                    String nombreEliminar = leer.next();
                    eliminarProducto(nombreEliminar, X);
                    continue;
                case 4:
                    mostrarProductos(X);
                    continue;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("ERROR");
                    
                    
            }
            
        } while (menu != false);
        
        
        
        
        
        
        
    }
    
    
    
}
