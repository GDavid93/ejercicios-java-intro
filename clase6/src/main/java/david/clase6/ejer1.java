/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer1 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num1,num2 , opcion;
       System.out.print("Ingrese el 1° numero:");
       num1= leer.nextInt();
       System.out.print("Ingrese el 2° numero:");
       num2 = leer.nextInt();
       System.out.println(" ");
       opcion = 0;
       
    do {
            

            System.out.println("---- Menú de opciones ----");
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");
            System.out.println("-------------------------");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            System.out.println(" ");

            switch(opcion) {
                case 1: sumar (num1,num2);
                    break;
                case 2: restar (num1,num2);

                    break;
                case 3: multiplicar (num1,num2); 
                    
                    break;
                case 4:
                    if(num2 != 0) {
                       
                       dividir (num1,num2);
                    } else {
                        System.out.println("Error: no se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("¡Muchas gracias, Hasta luego!");
              
                    break;
                default:
                    System.out.println("Error: eleccion inválida.");
            }

            System.out.println(); 
        } while(opcion != 5);   
        
        
    }
     
    public static void sumar (int num1,int num2) {
        System.out.println("El resultado de la suma es: " + (num1+num2));
        
    }
    public static void restar (int num1,int num2) {
        System.out.println("El resultado de la resta es: " + (num1-num2));
        
    }
    public static void multiplicar (int num1,int num2) {
        System.out.println("El resultado de la resta es: " + (num1*num2));
        
    }
    public static void dividir (int num1,int num2) {
        System.out.println("El resultado de la resta es: " + (num1/num2));
        
    }
}
