/*
2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.

 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String clave = "eureka";
        String claveIngresada;

        do {
            System.out.println("Ingrese la clave: ");
            claveIngresada = input.nextLine();

            if (claveIngresada.equalsIgnoreCase(clave) ) {//equalsIgnoreCase no tiene en cuenta mayusculas o minusculas
                System.out.println("Correcto");

            } else {
                System.out.println("Incorrecto");
            }
        } while (!claveIngresada.equalsIgnoreCase(clave));

    }
}
