/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        String name= input.next();
        System.out.println("Buenos días " + name + "!!");
    }
}
