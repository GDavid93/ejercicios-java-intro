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
public class ejext6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String [][] sopa = new String [20][20];
        int cont = 0, F = 20, C = 20;
        
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                sopa[i][j] = ("*");
            }
        }
        imprimir(sopa, F, C);
                   
        do{
          System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            String palabra = leer.nextLine();
            cont++;
        int x = (int) Math.floor((Math.random()*20));
        int y = (int) Math.floor((Math.random()*10));
//                for (int i = x; i < x; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[x][j+y] = String.toUpperCase((palabra.substring(j, j+1)));
                    }  
//                }
                }while(cont<5);
        
        imprimir(sopa, F, C);
        
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
             if (sopa[i][j] == ("*")){
                 sopa[i][j] = String.valueOf((int)Math.floor(Math.random()*10));
             }   
            }
        }
        imprimir(sopa, F, C);
    }
    
    public static void imprimir(String [][] matriz, int F, int C) {
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print("[" + matriz[i][j] +"]");
        }
        System.out.println("");
    }
        System.out.println("------------------------------------------------------------");
        System.out.println("");
}
}
