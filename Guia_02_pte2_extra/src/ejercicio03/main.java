/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una letra para determinar si es vocal o consonante 0 (cero) para salir ");
        String charString= " ";
        
//        do {   
//            System.out.println("Ingrese letra: ");
//            charString=input.next();
//            if (charString.equalsIgnoreCase("a") || charString.equalsIgnoreCase("e") || charString.equalsIgnoreCase("i") || charString.equalsIgnoreCase("o") ||charString.equalsIgnoreCase("u") ) {
//                System.out.println("La letra " + charString + " es una vocal.");
//            }else
//                 System.out.println("La letra " + charString + " NO es una vocal.");
//  
//        } while (!charString.equals("0"));
        
        // ó 
        
                do {   
            System.out.println("Ingrese letra: ");
            charString = input.next();
            
            char character = charString.toLowerCase().charAt(0);
            if (character >= 'a' && character <= 'z') {
                if ("aeiou".contains(String.valueOf(character))) {
                    System.out.println("La letra " + character + " es una vocal.");
                } else {
                    System.out.println("La letra " + character + " NO es una vocal.");
                }
            } else {
                System.out.println("No ha ingresado una letra válida.");
            }
            
        } while (!charString.equals("0"));
    
        
    }
}
