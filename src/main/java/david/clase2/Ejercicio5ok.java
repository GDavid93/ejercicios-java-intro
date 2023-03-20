/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package david.ejercicio5ok;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicio5ok {

    public static void main(String[] args) {
          int num1;     
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entero");
    num1 = leer.nextInt(); 
    System.out.println("El doble del numero ingresado es: " + (num1 * 2));
    System.out.println("El triple del numero ingresado es: " + (num1 * 3)); 
    System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num1));
    }
}
