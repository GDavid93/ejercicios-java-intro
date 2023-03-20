/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase7;

/**
 *
 * @author David
 */
public class ejer1 {
    public static void main(String[] args) {
       int[] vector= new int[100];
        for (int i=0; i < vector.length; i++ ){
            vector[i]= i+1;
        }
        
        for (int i = vector.length-1; i >= 0; i--){
        
            System.out.println(" "+vector[i]+" ");
        }

    }
}
