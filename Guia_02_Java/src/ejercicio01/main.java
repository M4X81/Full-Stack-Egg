/*
1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
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
        System.out.println("Ingrese un número entero ");
        int num1= input.nextInt();
        System.out.println("Ingrese otro número entero para realizar la suma de los mismos");
        int num2= input.nextInt();
        
        int resultado= num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
}
