/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando 
el cambio (void).

* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer3 {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("---------------[ ¡Bienvenidos! ]------------------");  
        String salir = "N";
        
        do{
        conversion();
            System.out.println("----------------------------------------------");
            System.out.println("¿Desea salir? S/N");
            salir= leer.nextLine();    
        }while(!salir.equalsIgnoreCase("S"));
        System.out.println("Hasta la proxima..");
    }
    
    
    
    public static void conversion (){ 
         Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de Euros a convertir:");
        int euro = leer.nextInt();
        System.out.println(" ");
        System.out.println("Seleciione la moneda a la cual desea convertirlo");
        System.out.print("Dolares - Yenes - Libras: ");
        String moneda = leer.nextLine();
        moneda = leer.nextLine();
       

        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println("----------------------------------------------");
                System.out.println(euro + "Euros es igual a: " + (euro*1.28611) + " Dolares"); 
               
                break;
            case "yenes":
                System.out.println("----------------------------------------------");
                System.out.println(euro + "Euros es igual a: " + (euro*129.852) + " Yenes");
               
              break;
            case "libras":
                System.out.println("----------------------------------------------");
                System.out.println(euro + " Euros es igual a: " + (euro*0.86) + " Libras");
                
                break;
            default: System.out.println("----------------------------------------------"); 
                     System.out.println("La moneda ingresada es incorrectamente");
                     
                   
        }
        
        
    }
    
}
