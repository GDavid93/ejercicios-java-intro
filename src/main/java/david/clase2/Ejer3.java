/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package david.ejer3;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejer3 {

    public static void main(String[] args) {
       String frase;
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
      frase = leer.nextLine(); 
    System.out.println("La frase en mayusculas es" + frase.toUpperCase());
    System.out.println("La frase en mayusculas es" + frase.toLowerCase());
    
    
    }
}
