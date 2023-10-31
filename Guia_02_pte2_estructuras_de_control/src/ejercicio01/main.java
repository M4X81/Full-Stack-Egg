/*
1. Crear un programa que dado un número determine si es par o impar.

 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        long num;
        do {
              System.out.println("Ingrese un número para determinar si es par o impar, 0 (cero) para salir");
         num = input.nextLong();
        
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");           
        }else{
            System.out.println("El número " + num + " es impar.");
        }
        } while (num !=0);

    }
}
