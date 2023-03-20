/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe devolver 
true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner  (System.in);
        System.out.println("---------------[ ¡Bienvenidos! ]------------------");
        
        String salir= "no";

            System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
         boolean primo = primos (num);
             if (primo) {
            System.out.println("El numero: " + num + " es primo");
        } else { 
            System.out.println("El numero: " + num + " no es primo");
        }            
        
    }
    public static boolean primos (int num){
        boolean primo= true;
        
        for (int i = (num - 1); i >= 2; i--) {

            if (num % i == 0) {
                primo = false;
            }
        } 
      return primo;
    }
    
}
