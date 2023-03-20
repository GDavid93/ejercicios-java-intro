/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase3;

import java.util.Scanner;

/**
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 
 * 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 * @author David
 */
public class ejer3 {
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una nota valida");
        System.out.println("aclaracion: la nota para ser valida debe estar entre 0 y 10");
        nota = leer.nextInt();
       
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota valida");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada " + nota + " es valida");
        
    }
}
