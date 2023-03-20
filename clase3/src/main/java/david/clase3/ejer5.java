/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
   ingresado seguido de tantos asteriscos como indique su valor
 */
package david.clase3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class ejer5 {
    public static void main(String[] args) {
        
      int num;
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese cuatro numero entre 1 y 20");
      for (int i = 0; i < 4 ; i++ ){ 
          num = leer.nextInt();
          if (num < 1 || num > 20 ){
              System.out.println("El numero ingreso es incorrecto");
              System.out.println("Ingrese un numero entre 1 y 20");
              num = leer.nextInt();
          }
          System.out.print(num + " ");
          for(int x = 0; x< num; x++)  { 
              System.out.print("*");
              
          }
          System.out.println(" ");
          
      }
         
         
         
         
         
         
     }
    
}
