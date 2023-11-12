/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {    
 Scanner input = new Scanner(System.in).useDelimiter("\n");
 
        System.out.println("Ingrese una frase, esta será mostrada en minúsculas y luego en mayúsculas.");
        String frase= input.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
}
