
package ejercicioextraextra.servicios;

import ejercicioextraextra.entidades.Pass;
import java.util.Scanner;


public class ServicioPass {
    
    public Pass crearUsuario(){
        
        return new Pass();
        
        
    }
    
    public void crearPass(Pass x){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String pw;
        
        do {
        System.out.println("Ingrese una contraseña (Exactamente 10 caracteres)");
        pw = leer.next();
        pw = pw.toLowerCase();
            
            if(pw.length() != 10){
                System.out.println("ERROR");
            }
            
        } while (pw.length() < 10 || pw.length() > 10);
        
        x.setPass(pw);
    }
    
    public void analizarPass(Pass x){
        
        int contZ = 0;
        int contA = 0;
        
        for (int i = 0; i < x.getPass().length(); i++) {
            
            if (x.getPass().substring(i, i+1).equals("a")) {
                contA++;
            }else if(x.getPass().substring(i, i+1).equals("z")){
                contZ++;
            }
        }
        
        if(contA > 1 && contZ > 0){
            System.out.println("TU CONTRASEñA ES DE NIVEL ALTO");
        }else if(contZ > 0 && contA < 2){
            System.out.println("TU CONTRASEñA ES DE NIVEL MEDIO");
        }else{
            System.out.println("TU CONTRASEñA ES DE NIVEL BAJO");
        } 
    }
    
    public void modificarNombre(Pass x){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
            System.out.println("Ingrese un numevo nombre");
            String n = leer.next();
            n = n.toLowerCase();
            x.setNombre(n);
            
        
        
    }
    
    public void modificarDNI(Pass x){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
            System.out.println("Ingrese un numevo DNI");
            long n = leer.nextLong();
            x.setDni(n);
        
        
    }
    
    
    public void menu(Pass x){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta;
        
        do {
        System.out.println("-----MENU-----");
        System.out.println("A) Ingresar contraseña");
        System.out.println("B) Consultar nivel de contraseña");
        System.out.println("C) Modificar contraseña");
        System.out.println("D) Modificar nombre");
        System.out.println("E) Modificar DNI");
        System.out.println("F) SALIR");
        
        respuesta = leer.next();
        respuesta = respuesta.toUpperCase();
        
        switch(respuesta){
            case "A":
                crearPass(x);
                continue;
            case "B":
                analizarPass(x);
                continue;
            case "C":
                System.out.println("Primero ingrese su contraseña actual");
                String pw = leer.next();
                pw = pw.toLowerCase();
                
                if (pw.equals(x.getPass())) {
                    System.out.println("CORRECTO");
                    crearPass(x);
                }else{
                    System.out.println("ERROR, CONTRASENA INVALIDA");
                }
                continue;
            case "D":
                System.out.println("Primero ingrese su contraseña actual");
                String pw1 = leer.next();
                pw1 = pw1.toLowerCase();
                
                if (pw1.equals(x.getPass())) {
                    System.out.println("CORRECTO");
                    modificarNombre(x);
                }else{
                    System.out.println("ERROR, CONTRASENA INVALIDA");
                }
                continue;
            case "E":
                System.out.println("Primero ingrese su contraseña actual");
                String pw2 = leer.next();
                pw2 = pw2.toLowerCase();
                
                if (pw2.equals(x.getPass())) {
                    System.out.println("CORRECTO");
                    modificarDNI(x);
                }else{
                    System.out.println("ERROR, CONTRASENA INVALIDA");
                }
                continue;
            case "F":
                break;
        }
            
        } while (!"F".equals(respuesta));
        
        
        
        
        
    }
}
