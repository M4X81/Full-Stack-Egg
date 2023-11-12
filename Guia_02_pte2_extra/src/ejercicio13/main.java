/*
13.Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese alto de la escalera");
        int alto = input.nextInt();

        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
