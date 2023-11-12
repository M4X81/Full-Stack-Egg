/*
11. Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.

 */
package ejercicio11;

import java.util.Scanner;


/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
       
        try {
                System.out.println("Ingrese número entero para calcular cuantos digitos tiene");
        long num = input.nextLong();
       int cifra=0;
       //invierto si es negativo
        if (num < 0) {
            num = -num;
        }
         
          while (num > 0) {
            num = num / 10;
            cifra++;
        }
          System.out.println("El número ingresado tiene " + cifra + " dígitos" );
          
        } catch (Exception InputMismatchException) {
            System.out.println("El número es demasiado largo");
        }
    
    }
}
