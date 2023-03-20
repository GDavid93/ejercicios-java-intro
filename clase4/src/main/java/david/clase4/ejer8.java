/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese un numero");
        int lados = leer.nextInt();
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (i== 0 || i == lados-1 || j == 0 || j == lados-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
       
            }
            System.out.println(""); 
        }
        
        
        
        
        
        
        
        
    }
    
}
