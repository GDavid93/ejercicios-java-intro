/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este cuadrado 
es mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
es decir, están entre el 1 y el 9.

 */
package david.clase7;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer6 {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in); 
        int matriz [][]= new int[3][3];
        int suma [] = new int [8];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el numero para la posicion " + (i+1) + " - " + (j+1) +" (solo numeros entre 1 y 9)" );
                int num = leer.nextInt();
                if (num>=1 || num<=9) {
                    matriz [i][j]=num;
                } else {System.out.println("numero incorrecto, solo numeros entre 1 y 9, intente nuevamente");
                num= leer.nextInt();
                 matriz[i][j]= num;
                }
            }
        }
        
         imprimir (matriz);
         
        int k = -1;
           
      for (int i = 0; i < 3; i++) {
          k++;
          suma[6]+= matriz [i][i];   
          suma[7]= suma[7] + matriz[i][2-i]; 
          for (int j = 0; j < 3; j++) {             
           suma[k]+= matriz[i][j]; 
           suma[k+3]+= matriz [j][i];
              
          }
      }
        boolean magica = true;
        for (int i = 0; i < 7; i++) {
           
            if (suma[i] != suma[i+1]) {
                magica = false;
            } 
 
        }
  
        if (magica == false) {
                System.out.println("Lamatriz no es magica");            
            } else {
                System.out.println("Lamatriz es magica");
            }    
        
        
        
    }
  
    public static void imprimir (int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
             System.out.println(" ");
        }
    }
            
}
