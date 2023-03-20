/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase7;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer4 {
   public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat1[i][j] = (int)Math.floor(Math.random() * (10 - (-10) + 1) + (-10));
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat2[j][i] = mat1[i][j];
            }
        }
        
        for (int[] fila : mat1) {
            for (int elemento: fila){
                System.out.println();
            }
        }
    
  
        
    }
}
