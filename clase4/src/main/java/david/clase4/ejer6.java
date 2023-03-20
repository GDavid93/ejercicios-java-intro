/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar 
el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de 
salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package david.clase4;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class ejer6 {
   public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num1,num2 , opcion;
       System.out.println("Ingrese el 1° de los 2 numeros");
       num1= leer.nextInt();
       System.out.println("Ingrese el 2° numero");
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
                case 1:
                  
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    
                    System.out.println("La multiplicación es: " + (num1*num2));
                    break;
                case 4:
                    if(num2 != 0) {
                       
                        System.out.println("La división es: " + (num1/num2));
                    } else {
                        System.out.println("Error: no se puede dividir por cero.");
                    }
                    break;
                case 5:
                   
                        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                         String salir = leer.next();
                        if(salir.equalsIgnoreCase("S")){
                             System.out.println("¡Muchas gracias, Hasta luego!");
                        return;                           
                        }else {
                            System.out.println("Volveras al menur principal");
                          System.out.println("---- Menú de opciones ----");
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir del programa");
            System.out.println("-------------------------");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();}         
              
                    break;
                default:
                    System.out.println("Error: opción inválida.");
            }

            System.out.println(); 
        } while(opcion != 5);
       
    
 
       
      
       
       
       
       
   } 
}
