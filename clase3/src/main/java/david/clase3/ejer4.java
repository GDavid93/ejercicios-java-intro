/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar 
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package david.clase3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class ejer4 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
 
  int suma , i , num; 
  suma = 0;
  i =0;
  do { 
      System.out.println("Ingrese una numero mayor a 0");
      num = leer.nextInt();
      if (num == 0){
          System.out.println("Se capturo el numero 0");
        break;
      }
      if (num < 0 ){
       suma= suma;   
      } else suma= num + suma;
      i++;
   } while (i<20);
      if (suma > 0){
        System.out.println("El resultado de la suma de los numeros ingresados es de: " + suma);  
      }  
      
     
        
        
        
        
        
    }
    
}
