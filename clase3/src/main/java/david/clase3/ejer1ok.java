/*
 * 
       Scanner teclado=new Scanner(System.in);
       
       int num1,num2;
        System.out.print("Ingrese el primer numero: ");
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2=teclado.nextInt();
        
        if(num1 > 25 || num2 > 25){
            System.out.println("Al menos uno es mayor que 25 o ambos");
        }else if(num1 < 25 && num2 < 25){
            System.out.println("Ambos son menores que 25");
        }
     }
 */
package david.clase3;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer1ok {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       int num1 , num2;
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextInt();
        
        if(num1 > 25 || num2 > 25){
            System.out.println("Al menos uno es mayor que 25 o ambos");
        } else if (num1 < 25 && num2 < 25){
        System.out.println("Ambos son menores que 25");
        }
     
    }
}
 