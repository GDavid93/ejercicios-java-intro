/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package david.clase4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejer7 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     String secuencia, sEspecial, FDE;
     int opcion, v, f;
     v= 0;
     f= 0;
     sEspecial= "";        
    FDE= "&&&&&";
     System.out.println("-----------------------------------");
        System.out.println("[ Bienvenido al dispositivo RS232 ]");
        System.out.println("-----------------------------------");
        
        do {
            System.out.println("Ingrese la opcion correspondiente");
            System.out.println("1- Ingresar secuencia ");
            System.out.println("2- salir (ingresando secuencia especial FDE)");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1: 
                    System.out.println("---------------------------------");
                    System.out.println("Ingrese la secuencia a comprobar");
                    secuencia = leer.nextLine();
                    secuencia = leer.nextLine();
                    if(secuencia.length() <= 5 && secuencia.substring(0,1).equalsIgnoreCase("X") && secuencia.substring((secuencia.length()-1), (secuencia.length())).equalsIgnoreCase("O") ){
                        System.out.println("Secuencia correcta");
                        System.out.println("---------------------------------");
                         v++;    
                    }else { System.out.println("Secuencia incorrecta");
                    System.out.println("---------------------------------");
                            f++;
                          }
                     break;
                case 2: 
                    System.out.println("Ingrese la secuencia especial (FDE)");
                    sEspecial = leer.nextLine();
                    sEspecial = leer.nextLine();
                    if (!sEspecial.equals(FDE)) {
                        System.out.println("FDE incorrecto, intente nuevamente");
                        sEspecial = leer.nextLine();
                    } else { System.out.println("FDE Correcto");
                        System.out.println("Abandonando el sistema..");
                        System.out.println("Se ingresaron: " + v + " secuencias correctas");
                        System.out.println("Se ingresaron: " + f + " secuencias incorrectas");
                        return;
                    }
                    if (sEspecial.equals(FDE)) {
                        System.out.println("Abandonando el sistema..");
                        System.out.println("Se ingresaron: " + v + " secuencias correctas");
                        System.out.println("Se ingresaron: " + f + " secuencias incorrectas");
                        return;
                    }
                    break;
                default: System.out.println("la opcion ingresada es incorrecta"); 
                break;
             }     
            
        }while (!FDE.equals(sEspecial));
        
        System.out.println("Se ingresaron: " + v + "secuencias correctas");
        System.out.println("Se ingresaron: " + f + "secuencias incorrectas");
        
        
        
        
        
    }
}
