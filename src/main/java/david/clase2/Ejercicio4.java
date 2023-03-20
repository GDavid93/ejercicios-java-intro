/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package david.ejercicio4;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar 
 * su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * 
 * 
 * @author David
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       Float c , f ;
       Scanner leer = new Scanner (System.in);
     System.out.println("Ingrese los grados celcius");
     c = leer.nextFloat(); 
     f = 32 +(9*c/5); 
        System.out.println("La temperatura en Fahrenheit es: " + f + "F");
        
  
     
     
        
       
       
        
        
        
        
        
    }
}
