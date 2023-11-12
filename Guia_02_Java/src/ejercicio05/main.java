/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un número entero: ");
        int num= input.nextInt();
        
        int doble= num*2;
        int triple= num*3;
        double raiz= Math.sqrt(num);
        
        System.out.println("El numero ingresado es: " + num);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
        System.out.println("La raiz cuadrada (redondeada) del numero ingresado es: " + Math.round(raiz));
    }
}
