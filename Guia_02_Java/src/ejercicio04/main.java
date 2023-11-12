/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese temperatura en grados centigrados:");
        double cent= input.nextDouble();
        
       double fahrenheit= 32 + (9* cent/5);
       
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit + "F");
       
    }
}
