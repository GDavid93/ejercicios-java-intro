/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer2 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println("---------------[ ¡Bienvenidos! ]------------------");
          datos();     
        
        
        
    }
    
   public static void datos (){
       Scanner leer = new Scanner (System.in);
       String salir = "no";
       do{
           System.out.println("         Ingrese los datos de la persona");
       System.out.print("Nombre: ");
       String nombre = leer.nextLine(); 
       System.out.print("Edad: ");
       int edad = leer.nextInt();
       leer.nextLine();
           if (edad >= 18) {
               System.out.println("---------------[ Datos ]------------------");
               System.out.println("Nombre: " + nombre);
               System.out.println("Edad: " + edad + " Años");
               System.out.println("Mayor de edad");
               System.out.println("-----------------------------------------");
           } else {
               System.out.println("---------------[ Datos ]------------------");
               System.out.println("Nombre: " + nombre);
               System.out.println("Edad: " + edad + " Años");
               System.out.println("Menor de edad");
                System.out.println("-----------------------------------------");
           }
           System.out.println("¿Quiere seguir mostrando personas? Si/No");
           salir= leer.nextLine();
           System.out.println("----------------------------------------------");
           if (salir.equalsIgnoreCase("no")){
               System.out.println("¡Muchas gracias, hasta la proxima!");
           }
       
       }while(!salir.equalsIgnoreCase("no"));       
               
   } 
   
    
    
}
