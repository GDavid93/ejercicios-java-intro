/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package david.clase4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer2 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese una frase");
        
        String clave, intento; 
        clave = "eureka";
        intento = leer.nextLine();
        if(intento.equalsIgnoreCase(clave) == true ){
            System.out.println("Correcto");    
        }else System.out.println("Incorrecto");
        
        
        
        
     
        
        
        
        
        
        
        
        
    }
}
