/*
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
el usuario, validando que el primer número múltiplo del segundo e imprima 
si el primer número es múltiplo del segundo, sino informe que no lo
son.
 */
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejerguia2 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        System.out.print("1° "); 
        int num1 = leer.nextInt();
        System.out.print("2° "); 
        int num2 = leer.nextInt();
        System.out.println(" ");
        System.out.println(" Los numeros ingresados son 1° " + num1 + " / 2° " + num2);
        System.out.println(" ");
        EsMultiplo (num1,num2);
        
        
    }
   
    public static void EsMultiplo (int num1,int num2){
        if ((num1%num2) == 0) {
            System.out.println(" el primer numero ingresado (" + num1 + ") es multiplo del segundo (" + num2 + ")" );
        } else {
            System.out.println(" el primer numero ingresado (" + num1 + ") no es multiplo del segundo (" + num2 + ")" );
        }
  
    }
    
    
    
}
