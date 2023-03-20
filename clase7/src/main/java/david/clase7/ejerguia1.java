/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package david.clase7;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejerguia1 {
    public static void main(String[] args) {
      Scanner leer = new Scanner ( System.in);
      String [] equipo = new String [5];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre: ");
            equipo[i]= leer.nextLine();     
        }
 
       for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);          
  
       }
       
    }    
}
    
