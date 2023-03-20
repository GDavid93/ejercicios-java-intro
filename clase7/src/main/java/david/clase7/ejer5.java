/*
 *Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que 
una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada 
de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A 
se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package david.clase7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer5 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
         Random random = new Random();
         
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat1[i][j] = random.nextInt(10);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat2[j][i] = -mat1[i][j];
            }
        }
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat1[i][j]+" ");
            }
             System.out.println(" ");
        }
         System.out.println(" ");
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat2[i][j]+" ");          
            }
             System.out.println(" ");
        }
        
        boolean anti= false;
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != -mat2[j][i]) {
                    anti= false;
                } else {anti= true;
                    
                }
        
            }
        }
        if (anti) {
            System.out.println("La matriz es antisimétrica ");     
        } else {
            System.out.println("La matriz no es antisimétrica ");
        }
        
        
        
    }
}
