/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase2;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer1 {
    public static void main(String[] args) {
        
    int num1, num2 , result;
    
    Scanner leer = new Scanner(System.in); 
    
    System.out.println("Ingrese dos numeros: ");
    num1 = leer.nextInt();  
    num2 = leer.nextInt();
    result = num1 + num2; 
System.out.println("El resultado de la suma de los dos numeros es: " + result);
    }  
}
