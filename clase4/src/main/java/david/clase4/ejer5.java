/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
   solicite números al usuario hasta que la suma de los números introducidos 
   supere el límite inicial.
 */
package david.clase4;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer5 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int lim , num , suma;
     suma=0;
            
   System.out.println("Ingrese un numero como limite");
   lim= leer.nextInt();
        if(lim <= -1){ 
            System.out.println("Numero incorrecto, ingrese nuevamente");
            lim=leer.nextInt();
        }
        
         
       do { System.out.println("Ingrese un numero");
         num = leer.nextInt();
         suma= num + suma;
        } while (suma <= lim);
        
       System.out.println("Los numero que intenta sumar superaron el limite");   
        
    }
}
