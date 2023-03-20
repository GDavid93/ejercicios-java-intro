/*
a = @
e = #
i = $
o = %
u = *

*/
  
package david.clase6;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class ejerguia1 {
    public static void main(String[] args) {
        String caracteres =  "";
        Scanner leer = new Scanner (System.in);
        do {
        System.out.println(" -----------<Ingrese los caracteres>-----------------");
        System.out.println(" -----------<Para terminar ingrese un [.]>-----------");
        caracteres = leer.nextLine();
        caracteres = caracteres.toLowerCase();  
        String codificado = codificador(caracteres);
        System.out.println("Caracteres codificados: ");
            System.out.println(" ");    
        System.out.println(codificado);
        } while (!caracteres.endsWith("."));
        
        
           
    }
    
    public static String codificador (String caracteres){
     String codificado = "";
        for (int i = 0; i < caracteres.length()-1; i++) {
            switch (caracteres.substring(i, i+1)) {
                case "a": codificado = codificado.concat("@");       
                    break;
                case "e":codificado = codificado.concat("#"); 
                   break; 
                case "i":codificado = codificado.concat("$"); 
                    break;   
                case "o":codificado = codificado.concat("%");
                    break;
                case "u":codificado = codificado.concat("*");
                    break;                
                default:
                    codificado = codificado.concat(caracteres.substring(i,i+1));
                    break;
            }
 
        }
     
        return(codificado);
    }
    
    
}
