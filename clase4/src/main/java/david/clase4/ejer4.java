/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.

 */
package david.clase4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer4 {
   public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String frase, letra;
       System.out.println("Ingrese una frase o palabra");
       frase = leer.nextLine();
       letra = frase.substring(0,1);
       
      if (letra.equalsIgnoreCase("a") == true ){
       System.out.println("Correcto");
      } else System.out.println("Incorrecto");
       
       
       
       
       
   
       
       
       
       
   } 
}
