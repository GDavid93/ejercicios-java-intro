/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase4;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 * 
 * @author David
 */
public class ejer1 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if((num % 2) == 0){
            System.out.println("El numero: " + num + " es par");
        } else System.out.println("El numero: " + num + " es impar");
        
     
        
        
        
        
        
        
    }
}
